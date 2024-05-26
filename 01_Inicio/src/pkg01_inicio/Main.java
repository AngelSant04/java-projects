/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_inicio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese su edad: ");
        edad = lector.nextInt();
        System.out.println("Nombre: "+nombre+" Edad: "+edad);
    }
    
}

