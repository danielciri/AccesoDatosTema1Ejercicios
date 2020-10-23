package pkgEscribirFichTextBuf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichTextBuf {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		File f1 = new File("C:\\ADA\\Fichero.txt");
		//Declaracion del print writer
		  PrintWriter printWriter = null;	
		  //Capturamos los errores
		  try {			  
			  printWriter = new PrintWriter(new FileWriter(f1));			  
		  	  } catch (IOException e) {	  		  
		  		  e.printStackTrace();
		  	  }
		  //Declaramos el char
	      char c='w';
	      //Implementacion de un bucle para leer por teclado
	      while(c!='\\') {	    	  
	          System.out.print("Dime un char \n");
	          c=read.nextLine().charAt(0);
	          printWriter.println(c);
	      } 
	      //Cerramos
	        printWriter.close();
	}
}
