package juegoRol;

import java.io.Serializable;
import java.util.ArrayList;

public class EstadoJuego implements Serializable {
	
	private ArrayList<Personatge> listaPersonaje;
	
	/**
	 * Constructor que recibe como parametro un arraylist de personaje que es donde almacenaremos 
	 * los personas y sus armas esta clase se encarga del estado del juego para luego ser  guardado
	 */
	public EstadoJuego(ArrayList<Personatge> listaPersona) {
		this.listaPersonaje = listaPersona;
	}
	/**
	 * Metodo que imprime la lista de los personajes guardados
	 *
	 */
	@Override
	public  String toString() {
		   String imprime=" ";
	        for (Personatge e: listaPersonaje){
	            imprime=imprime+e.toString()+"\n";
	        }
	        return imprime;
	}
	

}
