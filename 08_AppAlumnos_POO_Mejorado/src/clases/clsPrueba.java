/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class clsPrueba {
    private String nombre;
    private String Apellidos;
    private int edad;
    private String sexo;

    public clsPrueba() {
    }        

    public clsPrueba(String nombre, String Apellidos, int edad, String sexo) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String leer(){
        return this.nombre + this.Apellidos + this.sexo; 
    }
    
}
