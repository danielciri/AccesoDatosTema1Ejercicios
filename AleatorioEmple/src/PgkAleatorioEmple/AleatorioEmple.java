package PgkAleatorioEmple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AleatorioEmple {
	public static void main(String[] args) throws IOException{
		//Declaracion de los distintos tipos de ficheros
		File fichero = new File ("C:\\ADA\\AleatorioEmple.dat");
		FileOutputStream fileout = new FileOutputStream( fichero);
		DataOutputStream dataOS = new DataOutputStream(fileout);
		//Declara
		int [] id = {1,2,3} ;
		int [] departamento = {10,11,12};
		float [] salario = {1002.45f,1569.67f,1874.69f}; 
		int [] edades = {21,22,23};
		String [] apellidos = {"Hola","Hola2","hola3"};
		for (int i = 0; i < id.length; i++) {
			dataOS.writeInt(id[i]);			
			dataOS.writeUTF(apellidos[i]);
			dataOS.writeInt(departamento[i]);
			dataOS.writeFloat(salario[i]);
			
			
		}
		dataOS.close();
		fileout.close();
		leerData(fichero);
	}
	public static void leerData(File fichero) throws IOException {
		FileInputStream f1 = new FileInputStream(fichero);
		DataInputStream dataIS = new DataInputStream(f1);
		String apellido;
		float salario;
		int dep;
		int e;
		int id;
		try {
			while (true) {
			apellido= dataIS.readUTF();
			id = dataIS.readInt();
			salario = dataIS.readFloat();
			//System.out.println("Nombre: " + n + "Edad" + e);
			
			}
				
			}catch(EOFException nfe) {
				System.out.println("Fin fechero");
				
			}
			
			dataIS.close();
		}
	
				
	
}
