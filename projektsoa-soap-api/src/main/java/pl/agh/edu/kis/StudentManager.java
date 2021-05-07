package pl.agh.edu.kis;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Singleton
@Startup
public class StudentManager {

    private String encodedFile = null;

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    private void createStudentList(){
        students.add(new Student("Jan",
                "Kowalski",
                "1998-01-01",
                "111111",
                new ArrayList<String>(Arrays.asList("angielski","soa","studio")
        )));
        students.add(new Student("Adam",
                "Mickiewicz",
                "1798-12-24",
                "444555",
                new ArrayList<String>(Arrays.asList("polski","soa","studio")
                )));
        students.add(new Student("Jacek",
                "Kowal",
                "1998-02-02",
                "222222",
                new ArrayList<String>(Arrays.asList("angielski","soa")
                )));



    }

    public String getEncodedFile() {
        return encodedFile;
    }

    public void setEncodedFile(String encodedFile) {
        this.encodedFile = encodedFile;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student s) {
        if(this.students == null) students = new ArrayList<>();
        students.add(s);
    }

    public void delStudent(int i){
        students.remove(i);
    }

    public Student modStudent(int index,String field,String val){
        if(field.equals("firstName")){
            students.get(index).setFirstName(val);
        }
        if(field.equals("lastName")){
            students.get(index).setLastName(val);
        }
        if(field.equals("birthdate")){
            students.get(index).setBirthDate(val);
        }
        if(field.equals("index")){
            students.get(index).setIndexNr(val);
        }
        if(field.equals("courses")){
            if(students.get(index).getCourses().contains(val)){
                students.get(index).delCourse(val);
            }else{
                students.get(index).setCourses(val);
            }
        }
        return students.get(index);
    }

}
