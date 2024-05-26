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
public class clsAtencionMedica {
    private int idAtencionMedica;
    private String especialidad;
    private String DNIPaciente;

    public clsAtencionMedica() {
    }

    public clsAtencionMedica(int idAtencionMedica, String especialidad, String DNIPaciente) {
        this.idAtencionMedica = idAtencionMedica;
        this.especialidad = especialidad;
        this.DNIPaciente = DNIPaciente;
    }    

    public int getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDNIPaciente() {
        return DNIPaciente;
    }        
    
}
