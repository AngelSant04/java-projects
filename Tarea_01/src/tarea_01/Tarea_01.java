/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_01;

import java.util.Scanner;

public class Tarea_01 {

    public static void main(String[] args) {
        int op = 0;
        Scanner lector = new Scanner(System.in);
        do {   
           op = opciones();         
           switch(op){
               case 1: triangulo();
               break;
               case 2: primo();
               break;
               case 3: factorial();
               break;
               case 4: System.out.println("Gracias");
               break;
           }           
        } while (op != 4);
    }
    
    static void triangulo(){
        int base, altura;  
        float area;
        Scanner lector = new Scanner(System.in);    
        System.out.println("Ingrese base: ");
        base = lector.nextInt();
        System.out.println("Ingrese altura: ");
        altura = lector.nextInt();
        area = area(base,altura);
        System.out.println("Area: "+area);
    }     
    
    static float area(int base, int altura){
        float area; 
        area = (float)(base*altura)/2;
        return area;
    }
    
    static void primo(){
        int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        numero = lector.nextInt();
        nprimo(numero);
    }
    
    static void nprimo(int numero){
        int divisores = 2;
        int bandera = 0; 
        if (numero == 1 || numero == 0) {
            System.out.println("El numero "+numero+" no es primo");
        } else {
            if(numero > 0){
                while(divisores < numero && bandera == 0){
                    if(numero % divisores == 0) bandera=1;                    
                    divisores++;
                }
                if(bandera == 0){
                    System.out.println("El numero "+numero+" es primo");
                }else{
                    System.out.println("El numero "+numero+" no es primo");
                }                
            }else System.out.println("Los numero primos son positivos");                
        }
    }   
    
    static void factorial(){
        int numero,factorial = 1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        numero = lector.nextInt();
        if(numero < 0) System.out.println("Entrada de numero no valida");            
        else factorial = nfactorial(numero);            
        System.out.println("El factorial del numero es: "+factorial);
    }
    static int nfactorial(int numero){
        int factorial = 1;
        if(numero == 0) factorial = 1;
        else{                    
            for (int i = 1; i < numero+1; i++) {
                factorial = factorial*i;
            }
        }
        return factorial;
    }
    
    static int opciones(){
        int op;
        System.out.println("1-Hallar el area de un triangulo");
        System.out.println("2-Identificar si un numero es primo");
        System.out.println("3-Factorial de un numero");
        System.out.println("4-Salir");
        System.out.println("ELEGIR OPCION: ");
        Scanner lector = new Scanner(System.in);
        op = lector.nextInt();
        if(op < 1 || op > 4) System.out.println("Valor ingresado no es correcto");
        return op;
    }
}
