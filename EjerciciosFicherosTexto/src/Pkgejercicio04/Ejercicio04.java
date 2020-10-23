package Pkgejercicio04;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Ejercicio04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ruta=".";
	      if(args.length>=1) {
	    	  ruta = args [0];
	      }
	      cuentaLineas(ruta);
	}
	  	public static void  cuentaLineas(String fichero) throws IOException {	
			//Creamos de nuestro objeto de tipo filereader
			FileReader fr = new FileReader(fichero);
			//creamos nuestro objeto de tipo bufereReader
			BufferedReader bf = new BufferedReader(fr);   
			//Imprimimos el nnumero de lineas que tiene nuestro fichero, para ello usamos el metodo count que nos facilita la clase bufferedReader 
		    System.out.println( "El fichero tiene" + bf.lines().count()+" lineas");
		    //Cerramos el lector
		    bf.close();	
	  	}
}
