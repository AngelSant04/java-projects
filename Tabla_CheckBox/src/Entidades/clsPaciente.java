/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class clsPaciente {
    private String dni;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String sexo;
    private int telefono;
    private String idHistorialClinico;

    public clsPaciente() {
    }

    public clsPaciente(String dni, String nombres, String apPaterno, String apMaterno, int edad, String sexo, int telefono, String idHistorialClinico) {
        this.dni = dni;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.idHistorialClinico = idHistorialClinico;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getIdHistorialClinico() {
        return idHistorialClinico;
    }    
        
}
