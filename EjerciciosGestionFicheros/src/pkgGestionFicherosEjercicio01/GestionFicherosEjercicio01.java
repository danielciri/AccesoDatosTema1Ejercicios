package pkgGestionFicherosEjercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInputStream.GetField;

public class GestionFicherosEjercicio01 {
	public static void main(String[] args) throws IOException {
		
		listarDirectorio("C:\\ADA\\");



	 
	
}
    public static void listarDirectorio(String directorio) throws IOException {
    	//Declaramos el fichero a buscar
    
        File f1 = new File(directorio);
        //Declaramos un array para ir almacenando los ficheros y luego listarlo
        File[] ficheros = f1.listFiles();
        //Declaracion de un bucle for para recorrer los ficheros.
        for(int i = 0; i < ficheros.length; i++) {
        	
             //Verificamos que se pueda leer          
            if(ficheros[i].canRead()) {
            	//Si se puede leer le colocamos una r
            	System.out.print("r");
            }else {
            	//En caso de no leer un guion
            	System.out.println("-");
            }
            // Validamos que sea de escriturua en caso de serlo le colocamos una "w" de no serlo
            //le poenemos un guion
            if(ficheros[i].canWrite()) {
            	System.out.print("w");
            }else {
            	System.out.print("-");
            }
            //Validamos que se pueda ejecutar. Si es po sible le ponemos una x
            // Si no se ejecuta se le pondra un guion
            if(ficheros[i].canExecute()) {
            	System.out.print("x");
            }else {
            	System.out.print("- ");
            }
            //Validamos que sea un directorio y obtenemos su n0mbre
            if(ficheros[i].isDirectory()) {
            	System.out.print(" "+ ficheros[i].getName());
            }
            /** validamos si se trata de un fichero, y de ser un fichero verificamos que tipo de extencion contiene
            para ello nos aprovechamos del metodo indexOf que nos permite pasarle como parametro una cadena a la cual hacemos referencia
            y verificamos si se trata de un archivo.txt, en caso de serlo llamamos al metodo contar lineas.
            **/
            else if( ficheros[i].isFile() && ficheros[i].getName().indexOf(".txt") > 0 ) {
        		System.out.print(" "+ficheros[i].getName());
        			//Contamos las lineas del fichero
            		System.out.println("  Numero Lineas: "+ CuentaLineas(directorio + ficheros[i].getName()));
            }else {
            	//Imprimimos por la consola aquellos ficheros que no tienen extension.txt
            	System.out.println(" "+ficheros[i].getName());
            }
           

        }
           
   
	    }
    public static int CuentaLineas (String filename) throws IOException {
        LineNumberReader MiFichero= new LineNumberReader(new FileReader(filename));
        while (MiFichero.readLine() != null) {}
        MiFichero.close();
        return MiFichero.getLineNumber();
      }



}
    



