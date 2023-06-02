/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    
    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println(nombre);
        
        
    }
    
}
