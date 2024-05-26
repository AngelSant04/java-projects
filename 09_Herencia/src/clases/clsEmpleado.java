/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsEmpleado {
    private String dni;
    private String nombres;
    private int edad;

    public clsEmpleado() {
    }

    public clsEmpleado(String dni, String nombres, int edad) {
        this.dni = dni;
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
