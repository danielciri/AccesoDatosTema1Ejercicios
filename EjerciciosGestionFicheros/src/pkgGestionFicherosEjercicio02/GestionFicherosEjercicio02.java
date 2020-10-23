package pkgGestionFicherosEjercicio02;

import java.io.File;
import java.io.IOException;

public class GestionFicherosEjercicio02 {

	public static void main(String[] args) throws IOException {
		
		File fichero = new File("ADA\\..\\examenMio.txt");
		//obtenemos la cadena de ruta con la que se construyó el objeto File , y puede ser un directorio actual relativo.
		System.out.println("Ruta: "+fichero.getPath());
		//obtenemos la cadena de ruta después de resolverla contra el directorio actual si es relativa
		System.out.println("Ruta absoluta: "+ fichero.getAbsolutePath());
		//obtenemps la cadena de ruta después de resolver cualquier ruta relativa contra el directorio actual y elimina cualquier ruta relativa
		System.out.println("Ruta cannonical: " + fichero.getCanonicalPath());
	}


}
