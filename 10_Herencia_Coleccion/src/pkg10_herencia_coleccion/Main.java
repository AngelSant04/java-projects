/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_herencia_coleccion;

import clases.clsColeccionEmpleados;
import clases.clsEmpPermanente;
import clases.clsEmpPorHoras;
import clases.clsEmpleado;

public class Main {

    public static void main(String[] args) {
        clsEmpleado objE = new clsEmpleado("123", "Juan", 21);
        clsEmpPermanente objP = new clsEmpPermanente(1500, "Portero", "456", "Alex", 30);
        clsEmpPorHoras objH = new clsEmpPorHoras(10, 20, "789", "ANA", 25);
        
        clsColeccionEmpleados coleccion = new clsColeccionEmpleados();
        
        coleccion.insertar(objE);
        coleccion.insertar(objP);
        coleccion.insertar(objH);
        
        System.out.println(coleccion.presentar());
    }
    
}
