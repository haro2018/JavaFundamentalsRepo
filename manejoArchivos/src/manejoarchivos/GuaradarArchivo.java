package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuaradarArchivo {

    public void GuardarArcivo(){
        String file = "C:\\Users\\DCA\\Desktop\\manejo de archivos";
       try (FileOutputStream fos = new FileOutputStream(file)){
        fos.write(100);
        fos.close();
    }

    void guardarArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}
