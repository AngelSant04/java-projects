/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class clsServicioMedico {
    private int idServicioMedico;
    private int numeroCupos;
    private String especialidad;

    public clsServicioMedico() {
    }

    public clsServicioMedico(int idServicioMedico, int numeroCupos, String especialidad) {
        this.idServicioMedico = idServicioMedico;
        this.numeroCupos = numeroCupos;
        this.especialidad = especialidad;
    }    

    public int getIdServicioMedico() {
        return idServicioMedico;
    }

    public int getNumeroCupos() {
        return numeroCupos;
    }

    public String getEspecialidad() {
        return especialidad;
    }    
        
}
