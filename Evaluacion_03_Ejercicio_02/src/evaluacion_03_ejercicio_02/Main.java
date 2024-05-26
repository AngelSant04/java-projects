/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_03_ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        int op = 0;
        Scanner lector = new Scanner(System.in);
        //Lectura de datos
        System.out.println("Ingrese numero 1: ");
        n1 = lector.nextInt();
        System.out.println("Ingrese numero 2: ");
        n2 = lector.nextInt();
        do {            
           //Lees la opcion 
           op = opciones();
           //Usar switch con la opcion
           //En cada case, se hace la llamada a la funcion que corresponda
           switch(op){
               case 1: System.out.println("La Suma de "+ n1 +" y "+ n2 +" es: "+ (n1+n2));
                   break;
               case 2: System.out.println("La Resta de "+ n1 +" y "+ n2 +" es: "+ (n1-n2));
                   break;
               case 3: System.out.println("La Multiplaicion de "+ n1 +" y "+ n2 +" es: "+ (n1*n2));
                   break;
               case 4: System.out.println("La Division de "+ n1 +" y "+ n2 +" es: "+ (n1/n2));
                   break;
               case 5: System.out.println("Gracias");
                   break;
           }           
        } while (op != 5);
    }
    
    static int opciones(){
        int op;
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Salir");
        System.out.println("ELEGIR OPCION: ");
        Scanner lector = new Scanner(System.in);
        op = lector.nextInt();
        return op;
    }
    
}
