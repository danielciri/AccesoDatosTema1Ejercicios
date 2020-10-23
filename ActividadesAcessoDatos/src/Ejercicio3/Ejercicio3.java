package Ejercicio3;
import java.io.File;
import java.io.IOException;

public class Ejercicio3 {
	public static void main (String args[])  {
		//Declaramos las variables
		File directorio = new File("C:/2doCurso");
		File directorio2 = new File("C:/2doCurso/1AVAL");
		File directorio3 = new File("C:/2doCurso/2AVAL");
		File directorio4 = new File("C:/2doCurso/3AVAL");
		//Comprobamos si existen los directorios que deseamos crear
		if(!directorio.exists()) {
			//Creamos los directorios
			directorio.mkdir();
			directorio2.mkdir();
			directorio3.mkdir();
			directorio4.mkdir();
			//Mostramos por pantalla un mensaje indicando que han sido creados con exito
			System.out.println("Directorio creado con exito");
			//Declaramos los ficheros
			File fichero1 = new File("C://2doCurso/1AVAL//ExamenMio.txt");
			File fichero2 = new File("C://2doCurso/1AVAL//ExamenTuyo.txt");
			//Capturamos los errores para la creacion del fichero
			try {
				fichero1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			//Capturamos el error para la creacion del fichero
			try {
				fichero2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Si ya existen mostramos el siguien mensaje
		else {
			System.out.println("Directorio existente");
		}	
	}
}
