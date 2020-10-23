package PkgEjercicio06;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio06 {
	static Scanner read = new Scanner(System.in);
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
		//Declaro un array list
		ArrayList<String> listaLineas = new ArrayList<String>();
		//Declaro un bucle que ira leyendo las lineas del fichero
		while((linea = br.readLine())!=null)
			//Cada linea que voy leyendo las agrego a mi arraylist
			listaLineas.add(linea);
		//Declaro un list de tipo iterator y le paso toda la longito de mi arraylist a este iterator
			ListIterator iter = listaLineas.listIterator(listaLineas.size());
			//Un bucle para mostrar las ultimas nLineas de un fichero
		for(int i = 0; i < numLineasUser;i++) {
			//Imprimo el iterador de manera inversa con el metdodo previus que lo que hace es leer el array de atras adelante
			System.out.println(iter.previous());
		}       

	}

}
