package PkgLeerFicherosBinarios;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicherosBinarios {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("C:\\ADA\\fichero_bin.ddr")){
            int valor=fis.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
        }catch(IOException e){
        	System.out.println("Error E/S: "+ e.getMessage());  
        }
    }
}
