package pl.agh.edu.kis;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Stateless
@WebService
public class ShowStudents {

    @Inject
    private StudentManager sm;

    @WebMethod(action = "show")
    @WebResult(name = "student")
    public List<Student> show(){
        return sm.getStudents();
    }

    @WebMethod(action = "findByIndex")
    @WebResult(name = "student")
    public Student findByIndex(@WebParam(name = "index") String nr){
        for(Student s:sm.getStudents()){
            if(s.getIndexNr().equals(nr))return s;
        }
        return null;
    }

    @WebMethod(action = "findByLastName")
    @WebResult(name = "student")
    public List<Student> findByLastName(@WebParam(name = "lastName") String ln){
        List<Student> res = new ArrayList<>();
        for(Student s:sm.getStudents()){
            if(s.getLastName().contains(ln))res.add(s);
        }
        return res;
    }

    @WebMethod(action = "findByFirstName")
    @WebResult(name = "student")
    public List<Student> findByFirstName(@WebParam(name = "firstName") String fn){
        List<Student> res = new ArrayList<>();
        for(Student s:sm.getStudents()){
            if(s.getFirstName().contains(fn))res.add(s);
        }
        return res;
    }

    @WebMethod(action = "findByBirthdate")
    @WebResult(name = "student")
    public List<Student> findByBirthdate(@WebParam(name = "comparisonType") String comp,@WebParam(name = "date") String d){
        List<Student> res = new ArrayList<>();
        int date_comp = Integer.parseInt(d.substring(0,4) + d.substring(5,7) + d.substring(9));
        for(Student s:sm.getStudents()){
            int date_s = Integer.parseInt(s.getBirthDate().substring(0,4) + s.getBirthDate().substring(5,7) + s.getBirthDate().substring(9));
            if(comp.equals("eq") && date_comp == date_s)res.add(s);
            if(comp.equals("ls") && date_s < date_comp)res.add(s);
            if(comp.equals("gr") && date_s > date_comp)res.add(s);
            if(comp.equals("leq") && date_s <= date_comp)res.add(s);
            if(comp.equals("geq") && date_s >= date_comp)res.add(s);
        }
        return res;
    }

    @WebMethod(action = "findByCourse")
    @WebResult(name = "student")
    public List<Student> findByCourse(@WebParam(name = "course") String c){
        List<Student> res = new ArrayList<>();
        for(Student s:sm.getStudents()){
            if(s.getCourses().contains(c))res.add(s);
        }
        return res;
    }

}
