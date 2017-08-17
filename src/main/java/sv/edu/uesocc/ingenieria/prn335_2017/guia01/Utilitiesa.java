/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author carlos
 */
public class Utilitiesa {
    
    /** Metodo para capturar las primeras 30 caracteres de una cadena de texto previamente ingresada*/
     public String getresumen(String resumen){
        
        return resumen.substring(0,30);
    }
    /** Metodo para convertir la primera letra de cada palabra de una cadena de texto previamente ingresada*/
   public String capitalizar(String resumen){
       String nuevacadena="";
       for(String palabra : resumen.split(" ")){
          nuevacadena +=palabra.substring(0,1).toUpperCase()+palabra.substring(1,palabra.length()).toLowerCase()+" ";
       }
       nuevacadena = nuevacadena.trim();
       resumen=nuevacadena;
       return resumen;
   }
   /** Metodo para capturar las veces que una frase coincide en la cadena de texto*/
   public int contarCoincidencias(String frase, String resumen){
       int posicion , contador=0;
       posicion=resumen.indexOf(frase);
       while(posicion!= -1 ){
           contador++;
           posicion=resumen.indexOf(frase,posicion+1);
       }
       return contador;
       
   }
   
    
}
