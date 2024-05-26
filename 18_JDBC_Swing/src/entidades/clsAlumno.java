/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class clsAlumno {

    private String Codigo;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private int idescuela;

    public clsAlumno() {
    }        

    public clsAlumno(String Codigo, String nombres, String apPaterno, String apMaterno, int edad, int idescuela) {
        this.Codigo = Codigo;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.idescuela = idescuela;
    }

    public String getCodigo() {
        return Codigo;
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

    public int getIdescuela() {
        return idescuela;
    }

    
}
