package pkgListadoDirectoriosEjer06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ListadoDirectoriosEjer06 {

	public static void main(String[] args) throws IOException {
		String ruta = "";
		// TODO Auto-generated method stub
		//Valido que el argumento no tenga otros argumentos
		if(args.length>=1) {
			ruta = args[0];
		}
		//le paso la ruta para crear el objeto de tipo file
		File directorio = new File(ruta);
		//Declaro un inputstream
		FileInputStream fis;
		//Valido si existe la ruta o no
		if(directorio.exists()) {
			//Creo un array de ficheros
			File listaArch [] = directorio.listFiles();
			//Creo un bucle para recorrer el array
			for (int i = 0; i < listaArch.length; i++) {	
				//Verifico si es un fichero o no
				if(listaArch[i].isFile()) {
					//Creo inicializo el objeto input stream y recibe por parametro el array con la poscion que ira leyendo
					fis = new FileInputStream(listaArch[i]);
					//imprimo por pantalla el nombre del fichero
					System.out.print(listaArch[i].getName());
					//Verifico si es de extencio pdf
					if(listaArch[i].getName().indexOf(".pdf") > -1) {	
						//Inicializo un array de bytes
						byte[] data = new byte[1024];
						int valor=-1;
						//Leeo el fichero
						valor = fis.read(data);
						//Convierto de bytes a string
						String tipo = new String(data);
						//Valido que la extencion coincida con su contenido
						if(tipo.indexOf("%PDF") > -1) {
							//Si coincide le paso un ok
							System.out.println(" ok");
						}else {
							//Si no coincide es un error
							System.out.println(" err");
						}		
					}	
					//Verifico si es de extencion .jpg y realizo los pasos que he realizado mas arriba
					else if(listaArch[i].getName().indexOf(".jpg") > -1) {						
						byte[] data = new byte[1024];
						int valor=-1;
						valor = fis.read(data);
						String tipo = new String(data);
						if(tipo.indexOf("JFIF") > -1) {
							System.out.println(" ok");
						}else {
							System.out.println("err");
						}
						
						
					}
					//Verifico si es de extencion  .exe y realizo los pasos que he realizado mas arriba
					else if(listaArch[i].getName().indexOf(".exe") > -1) {						
						byte[] data = new byte[1024];
						int valor=-1;
						valor = fis.read(data);
						String tipo = new String(data);
						if(tipo.indexOf("MZ") > -1) {
							System.out.println(" ok");
						}else {
							System.out.println("err");
						}						
						
					}
					//Verifico si es de extencion .png y realizo los pasos que he realizado mas arriba
					else if(listaArch[i].getName().indexOf(".png") > -1) {						
						byte[] data = new byte[1024];
						int valor=-1;
						valor = fis.read(data);
						String tipo = new String(data);
						if(tipo.indexOf("PNG") > -1) {
							System.out.println(" ok");
						}else {
							System.out.println("err");
						}				
						
					}
					//Valido si se trata de un directorio
				}else if(listaArch[i].isDirectory()) {
					//En caso de serlo declaro un arrray donde almacenara los directorios
					File directorios[] = listaArch[i].listFiles();
					//Obtengo los nombres
					System.out.print(listaArch[i].getName());
					//Verifico si el directorio es mayor de cero
					if(directorios.length>0) {
						//Le colo lleno
						System.out.println("LL");
					}else {
						//Imprimo vacio
						System.out.println("VA");
					}
				}
							
			}	
				
		}else {
			System.out.println("Directorio no existente");
		}
	}
		 
}
		


