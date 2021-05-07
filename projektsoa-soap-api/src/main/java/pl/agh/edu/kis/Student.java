package pl.agh.edu.kis;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String indexNr;

    @XmlElementWrapper(name = "courses")
            @XmlElement(name = "course")
    List<String> courses = new ArrayList<>();

    public Student(){
    }

    public Student(Student s){
        this.firstName = s.firstName;
        this.lastName = s.lastName;
        this.birthDate = s.birthDate;
        this.indexNr = s.indexNr;
        this.courses = new ArrayList<>(s.courses);
    }

    public Student(String firstName, String lastName, String birthDate, String indexNr, List<String> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.indexNr = indexNr;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIndexNr() {
        return indexNr;
    }

    public void setIndexNr(String indexNr) {
        this.indexNr = indexNr;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(String course) {
        if(this.courses == null) this.courses = new ArrayList<>();
        this.courses.add(course);
    }

    public void delCourse(String course){
        int i =0;
        for(String s:courses){
            if(s.equals(course))break;
            i++;
        }
        courses.remove(i);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", indexNr='" + indexNr + '\'' +
                ", courses=" + courses.toString() +
                '}';
    }
}
