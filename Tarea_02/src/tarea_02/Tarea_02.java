/*Leer un conjunto de números hasta que se ingrese un CERO. 
Mostrar al finalizar el ingreso de datos: el número mayor, el número menor y el 
promedio de todos los números.*/
package tarea_02;

import java.util.Scanner;

public class Tarea_02 {
    
    public static void main(String[] args) {
        int numero,mayor = 0,menor = 0,suma = 0,contador = 0,bandera = 0;
        float promedio;
        Scanner lector = new Scanner(System.in);
        do {            
            System.out.println("Ingrese numero: ");
            numero = lector.nextInt(); 
            if(numero != 0){
                //hallamos mayor y menor            
                if(contador == 0){
                    mayor = numero;
                    menor = numero;                
                }   
                if(numero > mayor) mayor = numero;
                if(numero < menor) menor = numero;
                //Hallamos valores que utilizaremos para obtener el promedio            
                suma = suma + numero;
                contador++; 
                bandera = 1;
            }
        }while (numero != 0);
        if(bandera == 1){
            promedio = (float)suma/contador;
            System.out.println("Mayor: "+mayor+" Menor: "+menor);
            System.out.println("Promedio: "+promedio);
        }else System.out.println("No se reguistro ningun numero");
        
    }
    
}
