package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    public static void grabar(String nombre_archivo, String area) {

        FileWriter fw = null;
        try {
            File f = new File(nombre_archivo);
            fw = new FileWriter(f);
            fw.write(area);

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
