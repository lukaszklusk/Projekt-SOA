
package pl.edu.agh.kis.show;

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

    private final static QName _FindByBirthdate_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByBirthdate");
    private final static QName _FindByBirthdateResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByBirthdateResponse");
    private final static QName _FindByCourse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByCourse");
    private final static QName _FindByCourseResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByCourseResponse");
    private final static QName _FindByFirstName_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByFirstName");
    private final static QName _FindByFirstNameResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByFirstNameResponse");
    private final static QName _FindByIndex_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByIndex");
    private final static QName _FindByIndexResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByIndexResponse");
    private final static QName _FindByLastName_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByLastName");
    private final static QName _FindByLastNameResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "findByLastNameResponse");
    private final static QName _Show_QNAME = new QName("http://show.kis.edu.agh.pl/", "show");
    private final static QName _ShowResponse_QNAME = new QName("http://show.kis.edu.agh.pl/", "showResponse");

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
     * Create an instance of {@link FindByBirthdate }
     * 
     */
    public FindByBirthdate createFindByBirthdate() {
        return new FindByBirthdate();
    }

    /**
     * Create an instance of {@link FindByBirthdateResponse }
     * 
     */
    public FindByBirthdateResponse createFindByBirthdateResponse() {
        return new FindByBirthdateResponse();
    }

    /**
     * Create an instance of {@link FindByCourse }
     * 
     */
    public FindByCourse createFindByCourse() {
        return new FindByCourse();
    }

    /**
     * Create an instance of {@link FindByCourseResponse }
     * 
     */
    public FindByCourseResponse createFindByCourseResponse() {
        return new FindByCourseResponse();
    }

    /**
     * Create an instance of {@link FindByFirstName }
     * 
     */
    public FindByFirstName createFindByFirstName() {
        return new FindByFirstName();
    }

    /**
     * Create an instance of {@link FindByFirstNameResponse }
     * 
     */
    public FindByFirstNameResponse createFindByFirstNameResponse() {
        return new FindByFirstNameResponse();
    }

    /**
     * Create an instance of {@link FindByIndex }
     * 
     */
    public FindByIndex createFindByIndex() {
        return new FindByIndex();
    }

    /**
     * Create an instance of {@link FindByIndexResponse }
     * 
     */
    public FindByIndexResponse createFindByIndexResponse() {
        return new FindByIndexResponse();
    }

    /**
     * Create an instance of {@link FindByLastName }
     * 
     */
    public FindByLastName createFindByLastName() {
        return new FindByLastName();
    }

    /**
     * Create an instance of {@link FindByLastNameResponse }
     * 
     */
    public FindByLastNameResponse createFindByLastNameResponse() {
        return new FindByLastNameResponse();
    }

    /**
     * Create an instance of {@link Show }
     * 
     */
    public Show createShow() {
        return new Show();
    }

    /**
     * Create an instance of {@link ShowResponse }
     * 
     */
    public ShowResponse createShowResponse() {
        return new ShowResponse();
    }

    /**
     * Create an instance of {@link Student.Courses }
     * 
     */
    public Student.Courses createStudentCourses() {
        return new Student.Courses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByBirthdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByBirthdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByBirthdate")
    public JAXBElement<FindByBirthdate> createFindByBirthdate(FindByBirthdate value) {
        return new JAXBElement<FindByBirthdate>(_FindByBirthdate_QNAME, FindByBirthdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByBirthdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByBirthdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByBirthdateResponse")
    public JAXBElement<FindByBirthdateResponse> createFindByBirthdateResponse(FindByBirthdateResponse value) {
        return new JAXBElement<FindByBirthdateResponse>(_FindByBirthdateResponse_QNAME, FindByBirthdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByCourse")
    public JAXBElement<FindByCourse> createFindByCourse(FindByCourse value) {
        return new JAXBElement<FindByCourse>(_FindByCourse_QNAME, FindByCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByCourseResponse")
    public JAXBElement<FindByCourseResponse> createFindByCourseResponse(FindByCourseResponse value) {
        return new JAXBElement<FindByCourseResponse>(_FindByCourseResponse_QNAME, FindByCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByFirstName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByFirstName }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByFirstName")
    public JAXBElement<FindByFirstName> createFindByFirstName(FindByFirstName value) {
        return new JAXBElement<FindByFirstName>(_FindByFirstName_QNAME, FindByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByFirstNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByFirstNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByFirstNameResponse")
    public JAXBElement<FindByFirstNameResponse> createFindByFirstNameResponse(FindByFirstNameResponse value) {
        return new JAXBElement<FindByFirstNameResponse>(_FindByFirstNameResponse_QNAME, FindByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIndex }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIndex }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByIndex")
    public JAXBElement<FindByIndex> createFindByIndex(FindByIndex value) {
        return new JAXBElement<FindByIndex>(_FindByIndex_QNAME, FindByIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIndexResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIndexResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByIndexResponse")
    public JAXBElement<FindByIndexResponse> createFindByIndexResponse(FindByIndexResponse value) {
        return new JAXBElement<FindByIndexResponse>(_FindByIndexResponse_QNAME, FindByIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByLastName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByLastName }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByLastName")
    public JAXBElement<FindByLastName> createFindByLastName(FindByLastName value) {
        return new JAXBElement<FindByLastName>(_FindByLastName_QNAME, FindByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByLastNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByLastNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "findByLastNameResponse")
    public JAXBElement<FindByLastNameResponse> createFindByLastNameResponse(FindByLastNameResponse value) {
        return new JAXBElement<FindByLastNameResponse>(_FindByLastNameResponse_QNAME, FindByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Show }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Show }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "show")
    public JAXBElement<Show> createShow(Show value) {
        return new JAXBElement<Show>(_Show_QNAME, Show.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://show.kis.edu.agh.pl/", name = "showResponse")
    public JAXBElement<ShowResponse> createShowResponse(ShowResponse value) {
        return new JAXBElement<ShowResponse>(_ShowResponse_QNAME, ShowResponse.class, null, value);
    }

}
