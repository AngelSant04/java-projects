/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsPaciente {
    
    private String DNI;
    private String nombres;
    private int edad;
    private String sexo;
    private String distrito;

    public clsPaciente() {
    }

    public clsPaciente(String DNI, String nombres, int edad, String sexo, String distrito) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.edad = edad;
        this.sexo = sexo;
        this.distrito = distrito;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDistrito() {
        return distrito;
    }
    
    @Override
    public String toString() {
        return DNI+" - "+nombres+" - "+edad+" - "+sexo+" - "+distrito;
    }
    
}
