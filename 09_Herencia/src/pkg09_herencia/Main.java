/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_herencia;

import clases.clsEmpPermanente;
import clases.clsEmpPorHoras;
import clases.clsEmpleado;

public class Main {

    public static void main(String[] args) {
        clsEmpleado objE = new clsEmpleado("123", "Juan", 21);
        clsEmpPermanente objP = new clsEmpPermanente(1500, "Portero", "456", "Alex", 30);
        clsEmpPorHoras objH = new clsEmpPorHoras(10, 20, "789", "ANA", 25);
        
        System.out.println("Nombre de Empleado: "+objE.getNombres());
        System.out.println("Nombre de Permanente: "+ objP.getNombres());
        System.out.println("Nombre de horas: "+ objH.getNombres());
        System.out.println("========================================");
        mostrar(objE);
        mostrar(objP);
        mostrar(objH);
    }
    
    
    public static void mostrar(clsEmpleado obj){
        System.out.println("Nombre: "+ obj.getNombres());
    }
    
}
