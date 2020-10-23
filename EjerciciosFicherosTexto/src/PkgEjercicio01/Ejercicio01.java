package PkgEjercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.*;

class Ejercicio01 {
   public static void main(String [] args) {
     
      FileReader fr = null;
      BufferedReader br = null;
      String cadenaInvertida = " ";
      String ruta = ".";
      if(args.length>=1) {
    	  ruta = args [0];
      }
      File  archivo = new File (ruta);
      if(!archivo.exists()) {
    	  System.out.println("No existe el archivo");
      }else {
    	  try {
    	       
    	         fr = new FileReader (archivo);
    	         br = new BufferedReader(fr);
    	         String linea;
    	         while((linea=br.readLine())!=null)
    	         for (int i = linea.length() -1; i>=0 ; i--) {
    	        	cadenaInvertida +=linea.charAt(i); 
    				
    			}
    	         System.out.println(cadenaInvertida);
    	         
    	      }
    	      catch(Exception e){
    	         e.printStackTrace();
    	      }finally{

    	         try{                    
    	            if( null != fr ){   
    	               fr.close();     
    	            }                  
    	         }catch (Exception e2){ 
    	            e2.printStackTrace();
    	         }
    	      }
    	  
      }
      
   }
}
