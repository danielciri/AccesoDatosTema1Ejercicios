package pkgct05scribirichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Act05EscribirFichero {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\ADA\\FicheroActividad04.txt");
		if(!f1.exists()) {
			System.out.println("Ruta no valida");
		}else {
			try {
				//Le paso la ruta del fichero
				FileWriter fw = new FileWriter(f1,true);
				//Invoco al metodo que voy a escribir
				escribirFichero(fw);
				//Guardo lo que he escrito en fichero
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void  escribirFichero(FileWriter fw) {
		//Declaro el scanner para leer por teclado
		Scanner read = new Scanner(System.in);
		//Capturo excepciones
		try {
			//Declaro un boleano
			boolean validado = false;
			//Implementacion del bucle do-while
			do {


				//leo por teclado
				String texto = read.nextLine();
				//Escribo lo que voy leyendo por teclado
				fw.write(texto);
				//Compruebo que el usuario no me pase el caracter /.
				if(texto.equalsIgnoreCase("/")) {
					System.out.println("Dejara de escribir");
					//Igualo el boleano a true y salgo del bucle.
					validado = true;
					System.out.println("Saliendo...");
				}
			}while(!validado);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
