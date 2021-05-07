
package pl.edu.agh.kis.manage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.agh.kis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddStudent_QNAME = new QName("http://manage.kis.edu.agh.pl/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://manage.kis.edu.agh.pl/", "addStudentResponse");
    private final static QName _DelStudent_QNAME = new QName("http://manage.kis.edu.agh.pl/", "delStudent");
    private final static QName _DelStudentResponse_QNAME = new QName("http://manage.kis.edu.agh.pl/", "delStudentResponse");
    private final static QName _ModStudent_QNAME = new QName("http://manage.kis.edu.agh.pl/", "modStudent");
    private final static QName _ModStudentResponse_QNAME = new QName("http://manage.kis.edu.agh.pl/", "modStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.agh.kis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link DelStudent }
     * 
     */
    public DelStudent createDelStudent() {
        return new DelStudent();
    }

    /**
     * Create an instance of {@link DelStudentResponse }
     * 
     */
    public DelStudentResponse createDelStudentResponse() {
        return new DelStudentResponse();
    }

    /**
     * Create an instance of {@link ModStudent }
     * 
     */
    public ModStudent createModStudent() {
        return new ModStudent();
    }

    /**
     * Create an instance of {@link ModStudentResponse }
     * 
     */
    public ModStudentResponse createModStudentResponse() {
        return new ModStudentResponse();
    }

    /**
     * Create an instance of {@link Student.Courses }
     * 
     */
    public Student.Courses createStudentCourses() {
        return new Student.Courses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "delStudent")
    public JAXBElement<DelStudent> createDelStudent(DelStudent value) {
        return new JAXBElement<DelStudent>(_DelStudent_QNAME, DelStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "delStudentResponse")
    public JAXBElement<DelStudentResponse> createDelStudentResponse(DelStudentResponse value) {
        return new JAXBElement<DelStudentResponse>(_DelStudentResponse_QNAME, DelStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "modStudent")
    public JAXBElement<ModStudent> createModStudent(ModStudent value) {
        return new JAXBElement<ModStudent>(_ModStudent_QNAME, ModStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://manage.kis.edu.agh.pl/", name = "modStudentResponse")
    public JAXBElement<ModStudentResponse> createModStudentResponse(ModStudentResponse value) {
        return new JAXBElement<ModStudentResponse>(_ModStudentResponse_QNAME, ModStudentResponse.class, null, value);
    }

}
