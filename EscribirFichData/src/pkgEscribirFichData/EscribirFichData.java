package pkgEscribirFichData;
import java.io.*;


public class EscribirFichData {
	public static void main(String[] args) throws IOException{
		File fichero = new File ("C:\\ADA\\FichData.dat");
		FileOutputStream fileout = new FileOutputStream( fichero);
		DataOutputStream dataOS = new DataOutputStream(fileout);
		String[] nombres = {"Juan","Pedro","Perico","Andres"};
		int [] edades = {21,22,23,24};
		for (int i = 0; i < edades.length; i++) {
			dataOS.writeUTF(nombres[i]);
			dataOS.write(edades[i]);
		}
		dataOS.close();
		leerData(fichero);
	}
	public static void leerData(File fichero) throws IOException {
		FileInputStream f1 = new FileInputStream(fichero);
		DataInputStream dataIS = new DataInputStream(f1);
		String n;
		int e;
		try {
			while (true) {
			n = dataIS.readUTF();
			e = dataIS.readInt();
			//System.out.println("Nombre: " + n + "Edad" + e);
			
			}
				
			}catch(EOFException nfe) {
				System.out.println("Fin fechero");
				
			}
			
			dataIS.close();
		}
	
				
	
}
