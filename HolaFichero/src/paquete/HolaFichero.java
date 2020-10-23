package paquete;

import java.io.File;
import java.io.IOException;
public class HolaFichero {
  
  static char Sistema;
  
  public static void main(String args[]) {
    char Sistema = MiSistema();
    System.out.println(Sistema);
    
  }
  
  static char MiSistema() {
    char Sis = '?';
    char Windows = 'W';
    char Linux='L';
    System.out.println("Creando mi primer fichero ...");  
    String so = System.getProperty("os.name"); 
    System.out.print("El sistema operativo es: ");
    if (so.charAt(0)==Windows) {
      System.out.print("Windows -> ");
      Sis = Windows;
    }
    else {
      System.out.print("Linux -> ");
      Sis = Linux;
    }
    return Sis;
  }
  
  public void CreoFicheroWindows() throws IOException {
    System.out.println("Creando fichero en Windows ...");
    File fwindows = new File("C:\\Instituto\\AccesoDatos\\CreoFicheroWindows2.txt");
    if (!fwindows.exists()) {
      fwindows.createNewFile();
        }
    System.out.println("Fichero creado en Windows.");
  }
  
  public void CreoFicheroLinux() throws IOException {
    System.out.println("Creando fichero en Linux ...");
    File funix = new File("/home/..../CreoFicheroUnix.txt");
    if (!funix.exists()) {
      funix.createNewFile();
        }
    System.out.println("Fichero creado en Unix.");
  }
  
}