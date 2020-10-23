package PkgEjercicio05;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner read = new Scanner(System.in);
	public static void main(String[] args) throws IOException {	
		String ruta=".";
		String sCadena = "";
		if(args.length>=1) {
			ruta = args [0];				
		    }	
		//Declaracion de la ruta donde se encuentra e fichero a leer		
	    FileReader fr = new FileReader(ruta);
	    //Declaramos el lector del fichero en este caso sera un bufferedReader
	    BufferedReader br = new BufferedReader(fr);      
		System.out.println("Introduzca el numero de lineas");
		int numLineasUser = read.nextInt();
		read.nextLine();
		String linea = " ";

			 for (int i = numLineasUser; i>0 ; i--) {
					System.out.println(br.readLine());
				}
		br.close();
	}
}