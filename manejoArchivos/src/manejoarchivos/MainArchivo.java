
package archivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MainArchivo {
    
      public static void main(String[] args) {
      try{
          GuaradarArchivo guardarArchivo = new GuaradarArchivo();
          guardarArchivo.guardarArchivo();
          
      } catch (FileNotFoundException ffe) {
          Logger.getLogger(MainArchivo.class.getName()).log(Level.SEVERE, null, ffe);
      }catch(IOException ie){
         Logger.getLogger(MainArchivo.class.getName()).log(Level.SEVERE, null, ie);
      }
    }
    
}
