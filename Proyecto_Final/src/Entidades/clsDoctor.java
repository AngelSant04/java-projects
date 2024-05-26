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
public class clsDoctor {
    private String idDoctor;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String especialidad;

    public clsDoctor() {
    }

    public clsDoctor(String idDoctor, String nombres, String apPaterno, String apMaterno, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.especialidad = especialidad;
    }

    public String getIdDoctor() {
        return idDoctor;
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

    public String getEspecialidad() {
        return especialidad;
    }
    
    
}
