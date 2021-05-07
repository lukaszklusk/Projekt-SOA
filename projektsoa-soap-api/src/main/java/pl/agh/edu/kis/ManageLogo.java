package pl.agh.edu.kis;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.io.*;
import java.util.Base64;

@Stateless
@WebService
public class ManageLogo {

    @Inject
    private StudentManager sm;

    @WebMethod(action = "upload")
    @WebResult(name = "result")
    public String upload(@WebParam(name = "path") String path){
        File file = new File(path);

        String encoded = null;
        try{
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            System.out.println((int)file.length());
            System.out.println(file.length());
            fileInputStreamReader.read(bytes);
            encoded = Base64.getEncoder().encodeToString(bytes);
            sm.setEncodedFile(encoded);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return encoded;
    }

    @WebMethod(action = "download")
    @WebResult(name = "result")
    public String download(@WebParam(name = "path") String path){
        byte[] decoded;
        try (FileOutputStream fos = new FileOutputStream(path)){
            decoded = Base64.getDecoder().decode(sm.getEncodedFile());

            fos.write(decoded);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }

}
