package pkgEjercicio04;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejercicio04 {
	public static void main(String[] args) {
		//Declaro el Scanner
		Scanner read = new Scanner(System.in);
		//Declaro la ruta
		String ruta = " ";
		if(args.length >= 1) {
			ruta = args[0];
		}else {
			System.out.println("No valida");
		}
		//Declaro un fichero
		File f1 = new  File(ruta);
		if(f1.isFile()) {
			//Capturo error
			try {
				//Declaro el filereader para ir leyendo el documento
				FileReader fr= new FileReader(f1);
				//Declaro el bufferedReader para almacenar el filereader
				BufferedReader bf = new BufferedReader(fr);
				//Declaro una cadena para almacenar el texto
				String cadena;
				//Capturo una nueva excepcion 
				try {
					//Implemento el bucle while para obtener todas las letras del fichero.
					while((cadena = bf.readLine())!=null)
						//Imprimo la cadena de texto dentro del fichero.
						System.out.println(cadena);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Lo siento no podemos leer ese tipo de archivo");
		}	
	}
}
