
package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LeerArchivo {
    
    public void leerArchivo(){
    String file = "C:\\\\Users\\\\DCA\\\\Desktop\\\\manejo de archivos\";"
           
 try(InputStream fis = new FileInputStream(file)){
     int b =fis.read();
     System.out.println(b);
     fis.close();
 } catch (FileNotFoundException ffe){
     fis.printStackTrace();
 } catch (IOException ie){
     ie.printStackTrace();
 }          
 }
}
