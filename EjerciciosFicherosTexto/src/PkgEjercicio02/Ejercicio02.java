package PkgEjercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		 String ruta = ".";
		 String rutaCopia = ".";
	      if(args.length>=1) {
	    	  ruta = args [0];
	      }
	      if(args.length>=1) {
	    	  rutaCopia = args [1];
	      }
		leerEscribir(rutaCopia,ruta);
		System.out.println("Copiado correctamente");
	}
	public static void leerEscribir(String ficheroCopia,String ficheroOriginal) throws IOException {
		FileWriter f1 = new FileWriter(ficheroCopia,true);	
		FileReader fr = new FileReader(ficheroOriginal);
	      //Declaramos el lector del fichero en este caso sera un bufferedReader
	     BufferedReader br = new BufferedReader(fr);
         String linea;
         String cadena = " ";
         while((linea=br.readLine())!=null)
        	 cadena += linea;
         f1.write(cadena);
         f1.close();
        	 
		
	}

}
