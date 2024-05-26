/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_herencia_polimorfismo;

import clases.clsColeccionEmpleados;
import clases.clsEmpPermanente;
import clases.clsEmpPorHoras;
import clases.clsEmpleado;    //Cuando la clase es abstracta nos liberamos del NEW.

public class Main {

    public static void main(String[] args) {
        //clsEmpleado objE = new clsEmpleado("123", "Juan", 21);    No existe NEW
        clsEmpPermanente objP = new clsEmpPermanente(1500, "Portero", "456", "Alex", 30);
        clsEmpPorHoras objH = new clsEmpPorHoras(10, 20, "789", "ANA", 25);
        clsEmpleado obj = new clsEmpPorHoras(20, 30, "999", "PEDRO", 30);
        
        clsColeccionEmpleados coleccion = new clsColeccionEmpleados();
        
        //coleccion.insertar(objE);
        coleccion.insertar(objP);
        coleccion.insertar(objH);
        coleccion.insertar(obj);
        
        coleccion.calcularSueldo();                
        System.out.println(coleccion.presentar());
        coleccion.incrementoBono();
        System.out.println(coleccion.presentar()); 
    }    
}
