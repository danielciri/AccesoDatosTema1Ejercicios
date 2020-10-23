package PkgEjercicio07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio07 {
	//Declaramos como staticos el fileReader y el buffere ya que lo utilizaremos en diferentes metodos
	static FileReader fr;
    static BufferedReader bf ; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Valido la ruta
		String ruta=".";
	      if(args.length>=1) {
	    	  ruta = args [0];
	      }
	      cuentaLineas(ruta);
	      cuentaPalabras(ruta);
	      contadorCaracteres(ruta);
	}
	/**
	 * Metodo implementado para contar la lineas que tiene el fichero
	 * @param fichero recibe como parametro el fichero
	 * @throws IOException
	 */
	public static void  cuentaLineas(String fichero) throws IOException {	
		//Creamos de nuestro objeto de tipo filereader
		fr = new FileReader(fichero);
		//creamos nuestro objeto de tipo bufereReader
		bf = new BufferedReader(fr);   
		//Imprimimos el nnumero de lineas que tiene nuestro fichero, para ello usamos el metodo count que nos facilita la clase bufferedReader 
	    System.out.println( "El fichero tiene" + bf.lines().count()+" lineas");
	    //Cerramos el lector
	    bf.close();
	}
	/**
	 * Metodo implementado para contar los caracteres que hay en nuestro fichero
	 * @param fichero le pasamos el fichero
	 * @throws IOException
	 */
	public static void cuentaPalabras(String fichero) throws IOException {
		//Creamos nuestro objeto filereader
		fr = new FileReader(fichero);
		//Creamos nuestro objeto bufferedReader
		bf = new BufferedReader(fr);   
		//Declaramos la variable cadena para almacenar todo el contenido del fichero
	    String cadena =" ";
	    //Declaramos un contador para mostrar el numero de palabras que hay en cada linea 
	    int contador = 0;
	    //Bucle para leer el fichero
	    while((cadena = bf.readLine())!=null) {	    
	    	contador++;
	    	//Implementamos la clase StringTokenizer donde le pasamos la cadena y un espacio en blanco para saber que es una palabra
	    	StringTokenizer stringTokenizer2 = new StringTokenizer(cadena," ");
	    	//Imprimimos el numero de palabras que hay dentro de esa linea
	    	System.out.println("Numero de palabras en la linea " + contador +"= "+ stringTokenizer2.countTokens());
	    	
	    }
	    bf.close();
		
	}
	/**
	 * Metodo implementado para contar caracteres
	 * @param fichero recibe como parametro el fichero
	 * @throws IOException
	 */
    public static void contadorCaracteres(String fichero) throws IOException {
    	//Creamos nuestro objeto FileReader
    	fr = new FileReader(fichero);
    	//Creamos nuestro objeto bufferedReader
		bf = new BufferedReader(fr);  
		//Almaceno el contenido del fichero
		String cadena;
		int contador = 0;
		//Recorro el fichero
		while((cadena = bf.readLine())!=null) {
			contador++;
			//Imprimo los caracteres que hay por linea 
			System.out.println("El numero de caracteres en la linea " +contador+ "= " + cadena.length() );
		} 	
    }
}
