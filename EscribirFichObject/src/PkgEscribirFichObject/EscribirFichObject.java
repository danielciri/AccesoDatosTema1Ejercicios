package PkgEscribirFichObject;
import java.io.*;


public class EscribirFichObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Persona persona;
		File fichero = new File("C:\\ADA\\FichPersona.dat");
		FileOutputStream fileout = new FileOutputStream(fichero);
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		String[] nombres = {"Juan","Pedro","Perico","Andres"};
		int [] edades = {21,22,23,24};
		for (int i = 0; i < edades.length; i++) {
			 persona = new Persona(nombres [i],edades[i]);
			 dataOS.writeObject(persona);
		}
		dataOS.close();
		leerfichObject(fichero);
	
	}
	public static void leerfichObject(File fichero) throws IOException, ClassNotFoundException {
		Persona persona;
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream dataIS = new ObjectInputStream(filein);
		try {
			while(true) {
				persona = (Persona) dataIS.readObject();
				System.out.println("Nombre: " + persona.getNombre() + " edad: " + persona.getEdad());
				persona.toString();
			
			}
			
			
		}catch (EOFException eof) {
			
		}catch(ClassNotFoundException cnf) {
			 System.out.println(cnf.getMessage());
		}
		dataIS.close();
		
	}
}
