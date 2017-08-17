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
public class Utilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Utilitiesa guia01 = new Utilitiesa();
       String resumen="";
       resumen= ("practica uno de programacion tres crear un proyecto utilizando las herramientas maven y git "+
               "vistas en clase");
       System.out.println(guia01.getresumen(resumen));
       System.out.println(guia01.capitalizar(resumen));
       System.out.println(guia01.contarCoincidencias(resumen,resumen));
    }
    }
    

