/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_modulos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,n3;
        String nombre;
        float prom;
        int op = 0;
        Scanner lector = new Scanner(System.in);
        //Lectura de datos
        System.out.print("Ingrese nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese nota 1: ");
        n1 = lector.nextInt();
        System.out.println("Ingrese nota 2: ");
        n2 = lector.nextInt();
        System.out.println("Ingrese nota 3: ");
        n3 = lector.nextInt();
        do {            
           //Lees la opcion 
           op = opciones();
           //Usar switch con la opcion
           //En cada case, se hace la llamada a la funcion que corresponda
           switch(op){
               case 1: promedio(n1,n2,n3);
                   break;
               case 2: mayor(n1,n2,n3);
                   break;
               case 3: System.out.println("Gracias");
                   break;
           }           
        } while (op != 3);
        /*promedio(n1,n2,n3);
        prom = calcularPromedio(n1,n2,n3);
        System.out.println("El nuevo promedio es: "+prom);*/
    }
    
    //Funcion que no devuelve nada(Procedimiento)
    static void promedio(int n1, int n2, int n3){
        float promedio = 0;
        promedio = (n1+n2+n3)/3;
        System.out.println("Promedio: "+promedio);
    }
    //Funcion que retorna algun valor
    static float calcularPromedio(int n1, int n2,int n3){
        float promedio = 0;
        promedio = (n1+n2+n3)/3;
        return promedio;
    }
    static void mayor(int n1, int n2, int n3){
        if (n1 > n2 && n2 > n3) {
            System.out.println("Mayor: "+n1);
        }
        if (n2 > n1 && n1 > n3) {
            System.out.println("Mayor: "+n2);
        }
        if (n3 > n1 && n1 > n2) {
            System.out.println("Mayor: "+n3);
        }
    }
    
    static int opciones(){
        int op;
        System.out.println("1-Calcular Promedio");
        System.out.println("2-Encontrar mayor");
        System.out.println("3-Salir");
        System.out.println("ELEGIR OPCION: ");
        Scanner lector = new Scanner(System.in);
        op = lector.nextInt();
        return op;
    }
}
