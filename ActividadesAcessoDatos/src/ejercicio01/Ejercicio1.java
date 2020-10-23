package ejercicio01;

import java.io.File;

public class Ejercicio1 {
	public static void main(String[] args) {
	//Le pasamos la ruta
	  File f1 = new File("C:\\ADA");
		//Validamos que la ruta indicada sea correcta
	  if(!f1.isDirectory()) {
		  //Si no es correcta mostramos un mensaje de en
		 System.out.println("Directorio no existente");
	  }else {
		  //Creamos un array para almacenar los ficheros o directorios
		  File[] ficheros = f1.listFiles();  
		  //Recorremos el array
		  for(int i = 0; i < ficheros.length; i++){	
			  //Obtenemos el nombre
			  String nombre = ficheros[i].getName();	
			  //Le ponemos una condicion usando el operador ternario si es directorio o no
		      char tipo = ficheros[i].isDirectory() ? 'd' : 'f';
		      // Una condicion para saber si es de lectura 
		      String permisos= ficheros[i].canRead() ? "L" : "-";
		      //Condicion para saber si es de escritura 
	          permisos += ficheros[i].canWrite() ? "E" : "-";
	          //Mostramos por pantalla 
	          System.out.println(tipo +" "+  nombre + " " + permisos);        
		     
	  }
	       
	       
	  }		
	}
}