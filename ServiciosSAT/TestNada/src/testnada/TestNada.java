/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/**
 *
 * @author omar_gomez
 */
public class TestNada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String ubicacion = "D:\\workspaces\\ServiciosSAT\\NominaService\\NominaService.jnlp";
        File file = new File(ubicacion);
        InputStream targetStream = new FileInputStream(file);
        
        byte[] f = new byte[(int)file.length()];
        targetStream.read(f);
        String cadena =Base64.getEncoder().encodeToString(f);
        StringBuffer cadenaFinal = new StringBuffer();
        System.out.println(cadena.length());
        System.out.println(cadena.length()/100);
        int j=0;
        for(int i=0; i<cadena.length()/100;i++){
            cadenaFinal.append("\""+cadena.subSequence(j, j+100));
            cadenaFinal.append("\"+\n");
            j+=100;
        }
        cadenaFinal.append("\""+cadena.subSequence(j, cadena.length())+"\"");
        System.out.println(cadenaFinal);
        /*try (FileOutputStream fos = new FileOutputStream("D:\\Documentos\\Documents\\00_HACIENDA\\BRANCHS\\MST\\01_MASCP\\22_B_V1-1-0_24Oct2014_Mantenimiento\\Web\\public_html\\app\\salida.txt")) {
            fos.write(Base64.getDecoder().decode(cadena));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/
        
    }
    
}
