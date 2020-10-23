package ejercicio02;
import java.io.File;

public class Arbol {	
	public static void main(String []args) {
		//Le paso la ruta 
		File f1 = new File("C:\\Users\\");
		if(!f1.exists()) {
			System.out.println("Ruta no existente");
		}else {
		imprimeArbol(f1, " ");
		}
	}
	public static void imprimeArbol(File f1, String espacios) {
		 //Mostramos el nombre del fichero y lo concatenamos con un espacio en blanco
		System.out.println(espacios.concat(f1.getName()));
		//Validamos que sea un directorio y se pueda leer 
		if(f1.isDirectory() && f1.canRead()) {
			//Bucle foreach para mostrar de manera recursiva el arbol donde imprimimos los fichheros
			for (File f  : f1.listFiles()) {
				//Como es recursividad invocamos al mismo metodo y le concatenamos expacios en blanco/
				imprimeArbol(f,espacios.concat("  "));
			}
		}
		
	}
}
