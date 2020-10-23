package Pkgejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio03 {
	public static void main(String[] args) throws IOException {
		String rutaOriginial = "C:\\ADA\\fichero.txt";
		String rutaCopia ="C:\\ADA\\Mifichero.txt";
		leerEscribir(rutaCopia,rutaOriginial);
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
         fr.close();
		
	}
}
