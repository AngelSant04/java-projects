/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsEmpPorHoras extends clsEmpleado{
    private int horas;
    private double precioHora; 

    public clsEmpPorHoras() {
    }

    public clsEmpPorHoras(int horas, double precioHora, String dni, 
                            String nombres, int edad) {
        super(dni, nombres, edad);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    public int getHoras() {
        return horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }
    
    
}
