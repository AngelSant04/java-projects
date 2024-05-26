/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_vectores;

import java.util.Scanner;

public class Main {
    
    static Scanner teclado = new Scanner(System.in);
    //Declaracion de constante
    static final int MAX = 5;
    
    public static void main(String[] args) {
        //Variables locales
        int notas[] = new int[MAX];
        llenarDatos(notas);
        mostrarDatos(notas);
    }
    
    static void llenarDatos(int notas[]){
        /*Varibles locales o utiliza variables locales de otro lado dandole naciemiento
          a los parametros*/
        for (int i = 0; i < MAX; i++) {
            try{
                System.out.println("Ingrese nota["+(i+1)+"]");
                notas[i] = teclado.nextInt();
            }catch(Exception e){
                System.out.println("Error en entrada de datos");
            }
        }
    }
    
    static void mostrarDatos(int notas[]){
        for (int i = 0; i < MAX; i++) {
            System.out.println("Nota: "+notas[i]);
        }
    }    
}
