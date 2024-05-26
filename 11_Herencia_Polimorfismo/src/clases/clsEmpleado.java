/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public abstract class clsEmpleado {
    private String dni;
    private String nombres;
    private int edad;
    protected double sueldo;
    
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
    
    public void nuevoBono(double bono){
        this.sueldo = this.sueldo + bono;
    }
    
    //Metodo para SOBRE ESCRITURA
    public String mostrar(){
        return dni+"-"+nombres+"-"+edad;
    }       
    
    //Metodo ABSTRACTO(sin codigo) para SOBRE ESCRITURA
    public abstract void calcularSueldo();
    public abstract void aumentarBono();
}
