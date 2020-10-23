package PkgFicherosBinarios;

import java.io.*;

public class FicherosBinariosApp {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("C:\\ADA\\fichero_bin.ddr")){
            String texto="Esto es una prueba para ficheros binariosssss";
            // Podemos usar un numero que corresponder la tabla ASCII o un array de bytes
            //Copiamos el texto en un array de bytes
            byte codigos[]=texto.getBytes();
            fos.write(codigos);
        }catch(IOException e){
        	 System.out.println("Error E/S: "+ e.getMessage());  
        }
    }
}