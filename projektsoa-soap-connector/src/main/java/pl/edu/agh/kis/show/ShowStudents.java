package pl.edu.agh.kis.show;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.3
 * 2021-05-05T05:16:37.736+02:00
 * Generated source version: 3.3.3
 *
 */
@WebService(targetNamespace = "http://kis.edu.agh.pl/", name = "ShowStudents")
@XmlSeeAlso({ObjectFactory.class})
public interface ShowStudents {

    @WebMethod(action = "findByFirstName")
    @RequestWrapper(localName = "findByFirstName", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByFirstName")
    @ResponseWrapper(localName = "findByFirstNameResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByFirstNameResponse")
    @WebResult(name = "student", targetNamespace = "")
    public java.util.List<Student> findByFirstName(

        @WebParam(name = "firstName", targetNamespace = "")
        java.lang.String firstName
    );

    @WebMethod(action = "findByBirthdate")
    @RequestWrapper(localName = "findByBirthdate", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByBirthdate")
    @ResponseWrapper(localName = "findByBirthdateResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByBirthdateResponse")
    @WebResult(name = "student", targetNamespace = "")
    public java.util.List<Student> findByBirthdate(

        @WebParam(name = "comparisonType", targetNamespace = "")
        java.lang.String comparisonType,
        @WebParam(name = "date", targetNamespace = "")
        java.lang.String date
    );

    @WebMethod(action = "findByCourse")
    @RequestWrapper(localName = "findByCourse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByCourse")
    @ResponseWrapper(localName = "findByCourseResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByCourseResponse")
    @WebResult(name = "student", targetNamespace = "")
    public java.util.List<Student> findByCourse(

        @WebParam(name = "course", targetNamespace = "")
        java.lang.String course
    );

    @WebMethod(action = "findByIndex")
    @RequestWrapper(localName = "findByIndex", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByIndex")
    @ResponseWrapper(localName = "findByIndexResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByIndexResponse")
    @WebResult(name = "student", targetNamespace = "")
    public Student findByIndex(

        @WebParam(name = "index", targetNamespace = "")
        java.lang.String index
    );

    @WebMethod(action = "findByLastName")
    @RequestWrapper(localName = "findByLastName", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByLastName")
    @ResponseWrapper(localName = "findByLastNameResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.FindByLastNameResponse")
    @WebResult(name = "student", targetNamespace = "")
    public java.util.List<Student> findByLastName(

        @WebParam(name = "lastName", targetNamespace = "")
        java.lang.String lastName
    );

    @WebMethod(action = "show")
    @RequestWrapper(localName = "show", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.Show")
    @ResponseWrapper(localName = "showResponse", targetNamespace = "http://kis.edu.agh.pl/", className = "pl.edu.agh.kis.ShowResponse")
    @WebResult(name = "student", targetNamespace = "")
    public java.util.List<Student> show()
;
}
