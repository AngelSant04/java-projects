/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsPersona {
    private String dni;
    private String nombre;
    private int edad;
    private String distrito;

    public clsPersona() {
    }

    public clsPersona(String dni, String nombre, int edad, String distrito) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.distrito = distrito;
    } 

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    } 

    public String getDistrito() {
        return distrito;
    }       

    @Override
    public String toString() {
        return dni +" - "+nombre+" - "+edad+" - "+distrito; 
    }
    
    
    
}
