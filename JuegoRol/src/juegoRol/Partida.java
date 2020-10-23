package juegoRol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Partida  {
	private static final String FILE_NAME = "JuegoRolPartidaRol.dat";
	/**
	 * Metodo implementado para cargar la partida del juego
	 * @return nos retorna la partida cargada
	 */
	public static EstadoJuego cargarPartida() {
		EstadoJuego gameStatus = null;
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			gameStatus = (EstadoJuego) ois.readObject();
			
		}catch(FileNotFoundException fne) {
			System.out.println("No se ha encontrado");
		}catch(IOException ie) {
			System.out.println("Error al leer en el archivo " +FILE_NAME);
		}catch(ClassNotFoundException cnfe) {
			System.out.println("No con tiene datos validos");
		}finally {
			if(ois!=null) {
				try {
					ois.close();
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		return gameStatus;
	}
	/**
	 * Metodo implementado para guardar la partida del juego 
	 * @param EstadoJuego recibe el parametro el estado del juego
	 */
	public static void guardarPartida(EstadoJuego estadoJuego) {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(estadoJuego);
			oos.close();
			fos.close();
		}catch(FileNotFoundException fne) {
			System.out.println("No se ha encontrado");
		}catch(IOException ioe) {
			System.out.println();
		}
	}
	
}
