package juegoRol;
import java.io.Serializable;
public class Arma implements Serializable{
        private static final long serialVersionUID = 1L;
        private String nom;
        private int vida;
        /**
         * Constrcutor para crear un arma 
         * @param nom recibe como parametro el nombre del arma
         */
        public Arma(String nom) {
                this.nom = nom;
                this.vida = 100;
        }
        //getters y setters
        public String getNom() {
                return nom;
        }
        public void setNom(String nom) {
                this.nom = nom;
        }
        public int getVida() {
                return vida;
        }
        public void setVida(int vida) {
                this.vida = vida;
        }
}