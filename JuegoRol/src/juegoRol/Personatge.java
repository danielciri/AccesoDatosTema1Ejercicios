package juegoRol;

import java.io.Serializable;
import java.util.ArrayList;
public class Personatge implements Serializable {
      
        private static final long serialVersionUID = 1L;
        private String nom;
        private String tipus;
        private int forsa; // pot donar problemes la Ç
        private int vida;
        private ArrayList<Arma> armes;
        private int id;
        /**
         * Constructor para crear nuestro objeto personaje que recibe 3 parametros
         * @param nom el nombre del personaje
         * @param tipus el tipo del persona 
         * @param id el id del persona
         */
        public Personatge(String nom, String tipus,int id) {
                this.nom = nom;
                this.tipus = tipus;
                armes = new ArrayList<Arma>();
                armes.add(assignaArmaDefecte(tipus));
                this.forsa = calculaForsa(tipus);
                this.vida = 100;
                this.id = id;
        }
        /**
         * metodo implementado para calcular la fuerza del perona
         * @param tipus recibe el tipo de personaje
         * @return nos retorna la fuerza calculado
         */
        private int calculaForsa(String tipus) {
                int forsa = 0;
                switch (tipus) {
                case "Orc":
                        forsa = 70;
                        break;
                case "Elf":
                        forsa = 40;
                        break;
                case "Mag":
                        forsa = 30;
                        break;
                default:
                        forsa = 50;
                }
                return forsa;
        }
        /**
         * Asigna un arma por defecto
         * @param tipus el tipo de arma que se le asignara
         * @return nos retorna el arma asignada
         */
        private Arma assignaArmaDefecte(String tipus) {
                Arma arma;
                switch (tipus) {
                case "Orc":
                        arma = new Arma("Destral de lenyador");
                        break;
                case "Elf":
                        arma = new Arma("Arc de fusta");
                        break;
                case "Mag":
                        arma = new Arma("Vareta de Harry Potter");
                        break;
                default:
                        arma = new Arma("Punys");
                }
                return arma;
        }
        /**
         * Metodo implementado para signarle un arma al persona
         * @param nomArma recibe como parametro el nombre del arma
         * @return nos  retorna el arma escogida
         */
        public Arma assignaArma(String nomArma) {
            Arma arma;
                    arma = new Arma(nomArma);
                    armes.add(arma);
            return arma;
    }
        //getters y setters
        
        public String getNom() {
                return nom;
        }
        public int getID() {
        	return id;
        }
        public void setNom(String nom) {
                this.nom = nom;
        }
        public String getTipus() {
                return tipus;
        }
        public void setTipus(String tipus) {
                this.tipus = tipus;
        }
        public int getForsa() {
                return forsa;
        }
        public void setForsa(int forsa) {
                this.forsa = forsa;
        }
        public int getVida() {
                return vida;
        }
        public void setVida(int vida) {
                this.vida = vida;
        }
        public ArrayList<Arma> getArmes() {
                return armes;
        }
        
        /**
         * Metodo implementado para mostrar las armas
         * @return nos retonar un arrray con los armas
         */
        public String llistaArmes(){
                String llistat = "";
                for(Arma arma : this.armes)
                {
                        llistat = llistat + arma.getNom() + "("+arma.getVida()+") - ";
                }
                llistat = llistat.substring(0, llistat.length()-2);
                return llistat;
        }
        

        /**
         * metodo tu String para mostrar las caracteristicas del persona
         */
		public String toString(){
			return
                  "Informació del personatge\n" +
                "--------------------------\n" +
                "Nom: " +this.getNom()
                				+"\n ID: " +this.getID()
                                + "\nTipus: " + this.getTipus()
                                + "\nForça: " + this.getForsa()
                                + "\nVida: " + this.getVida()
                                + "\nLlistat d'armes: " + this.llistaArmes()
                                + "\n";
        }
}