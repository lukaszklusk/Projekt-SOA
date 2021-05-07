package pl.edu.agh.kis.main;

import pl.edu.agh.kis.encode.ManageLogo;
import pl.edu.agh.kis.encode.ManageLogoService;
import pl.edu.agh.kis.manage.ManageStudents;
import pl.edu.agh.kis.manage.ManageStudentsService;
import pl.edu.agh.kis.show.ShowStudents;
import pl.edu.agh.kis.show.ShowStudentsService;
import pl.edu.agh.kis.show.Student;

import javax.xml.ws.BindingProvider;

public class Main {
    public static void main(String[] args){
        ShowStudents showStudentsService = new ShowStudentsService().getShowStudentsPort();
        Student s = showStudentsService.findByIndex("111111");
        System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getBirthDate() + " " + s.getIndexNr());

        ManageStudents manageStudentsService = new ManageStudentsService().getManageStudentsPort();
        setCredentials((BindingProvider) manageStudentsService,"userone","userone");
        manageStudentsService.addStudent("Henryk","Sienkiewicz","888888","1900-05-05","soa,angielski");

        System.out.println(showStudentsService.findByIndex("888888"));

        ManageLogo manageLogoService = new ManageLogoService().getManageLogoPort();
        manageLogoService.upload("C:\\Users\\Kluch\\IdeaProjects\\projektsoa\\projektsoa-soap-api\\src\\main\\resources\\img.jpg");
        manageLogoService.download("C:\\Users\\Kluch\\IdeaProjects\\projektsoa\\projektsoa-soap-api\\src\\main\\resources\\decoded2.jpg");
    }

    private static void setCredentials(BindingProvider provider, String user, String password) {
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, user);
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
    }
}
