package juegoRol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Joc implements Serializable{
		//Declaracion de variables
        private static final long serialVersionUID = 1L;
        private static ArrayList<Personatge> listaPersona;
        private static Scanner read = new Scanner(System.in);
        /**
         * Exemple de serialització a partir de les classes Personatge i Arma
         * @throws IOException 
         * @throws ClassNotFoundException 
         */
        public static void main(String[] args)  {
        	//Inicializamos las variables
        	listaPersona = new ArrayList<>();
        	int opcion = 0;
        	//Creamos un objeto de tipo estado juego
            EstadoJuego gameStatus = new EstadoJuego(listaPersona);
            //Implementamos un bucle do while para mostrar el menu
        	do {
           		System.out.println("****Juego ROL****");
        		System.out.println("1.Lista Personaje");
        		System.out.println("2.Agregar Personaje");
        		System.out.println("3.Guardar Partida");
        		System.out.println("4.Borrar Usuario");
        		System.out.println("5.Cargar Partida");
        		opcion = read.nextInt();
        		read.nextLine();
        		//un switch para las opciones del menu
        		switch(opcion) {
        		case 1:
        			
        			System.out.println(gameStatus.toString());
        			break;
        		case 2:
        			crearPersona();		
        			break;
        		case 3:
        			Partida.guardarPartida(gameStatus);
        			System.out.println("Partida guardada");
        			break;
        		case 4:
   
        			eliminarUser();
        			break;
        		case 5:
        			gameStatus = Partida.cargarPartida();
        			System.out.println(gameStatus.toString());
        			break;

        		}
        		
        	}while(opcion!=0);
        }
        
        
        /**
         * Metodo implementado para la creacion de personajes
         */
       public static void crearPersona() {
    	String nom;
   		int opcionPersonaje;
		String tipo;
		int id = 0;
		boolean validado = false;
		System.out.println("Introduce el nombre");
		nom = read.nextLine();
		System.out.println("Introduzca el id");
		do {
			try {
				id = Integer.parseInt(read.nextLine());
				validado = true;
			}catch(NumberFormatException ime) {
				System.out.println("Solo numeros");
				validado= false;
			}
			
		}while(!validado);
		//implementamos un bucle do while para que el usuario escoja el tipo de personaje 
		//dependiendo de la opcion escogida se le dara el tipo de de personaje
		do {
			System.out.println("Escoge tu tipo de personaje");
   			System.out.println("1.Orc");
   			System.out.println("2.Elf");
   			System.out.println("3.Mag");
   			opcionPersonaje = read.nextInt();
   			read.nextLine();
   			//Verificamos si la opcion es igual 1 y creamos el personaje de tipo orc
   			if(opcionPersonaje==1) {
   				tipo ="Orc";
   				listaPersona.add(new Personatge(nom,tipo,id));
   				validado = true;
   	   			//Verificamos si la opcion es igual 2 y creamos el personaje de tipo elf
   			}else if(opcionPersonaje ==2) {
   				tipo = "Elf";
   				listaPersona.add(new Personatge(nom,tipo,id));
   				validado = true;
   	   			//Verificamos si la opcion es igual 3 y creamos el personaje de tipo mag
   			}else if(opcionPersonaje ==3) {
   				tipo = "Mag";
   				listaPersona.add(new Personatge(nom,tipo,id));
   				validado = true;
   				//Si no es niguno de los 3 le decimos que introduzca una opcion valida 
   			}else {
   				System.out.println("Introduzca una opcion valida");
   				validado = false;
   			}
		}while(!validado);       	
       }
        
       /**
        * Metodo implementado para eliminar user
        */
        public static void eliminarUser() {
        	
        	System.out.println("Introduce el numero");
        	//Leemos el id por teclado
        	int num = read.nextInt();
        	read.nextLine();
        	//Creamos un bucle para ir recorriendo la lista y donde coincida el id eliminamos esa posicion del array
        	for (int i = 0; i < listaPersona.size(); i++) {
				if(num == listaPersona.get(i).getID()) {
					listaPersona.remove(i);
					System.out.println("Usuario eliminado");
				}
				//Si no hay coincidencias le enviamos un menaje por pantalla a el usuario
				else {
					System.out.println("Uusario no encontrado");
				}
			}
        }
               
}
