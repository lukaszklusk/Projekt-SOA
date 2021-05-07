package pl.agh.edu.kis;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Stateless
@WebService
//@SecurityDomain("cxfservice-security-domain")
@RolesAllowed({"role1"})
@WebContext(authMethod = "BASIC", transportGuarantee="NONE", secureWSDLAccess=false)
public class ManageStudents {

    @Inject
    private StudentManager sm;

    @WebMethod(action = "addStudent")
    @WebResult(name = "result")
    public Student addStudent(@WebParam(name = "firstName") String fn,
                             @WebParam(name = "lastName") String ln,
                             @WebParam(name = "index") String ind,
                             @WebParam(name = "birthdate") String bd,
                             @WebParam(name = "courses") String cr){
        String[] tmp = cr.split(",");
        List<String> c = new ArrayList<>();
        c = Arrays.asList(tmp);

        for(Student s: sm.getStudents()){
            if(s.getIndexNr().equals(ind)) return new Student();
        }

        Student s = new Student(fn,ln,bd,ind,c);
        sm.setStudents(s);
        return s;
    }

    @WebMethod(action = "deleteStudent")
    @WebResult(name = "result")
    public Student delStudent(@WebParam(name = "index") String ind){
        Student s1 = new Student();
        int i = 0;
        boolean f = false;
        for(Student s: sm.getStudents()){
            if(s.getIndexNr().equals(ind)){
                s1 = new Student(s);
                f = true;
                break;
            }
            i++;
        }
        if(f) sm.delStudent(i);
        return s1;
    }

    @WebMethod(action = "modifyStudent")
    @WebResult(name = "result")
    public List<Student> modStudent(@WebParam(name = "index") String ind,
                                    @WebParam(name = "field") String fi,
                                    @WebParam(name = "value") String val){
        List<Student> res = new ArrayList<>();
        int i = 0;
        boolean f = false;
        for(Student s: sm.getStudents()){
            if(s.getIndexNr().equals(ind)){
                f = true;
                res.add(new Student(s));
                break;
            }
            i++;
        }
        res.add(new Student(sm.modStudent(i,fi,val)));
        return res;
    }
}
