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
public class clsCitaMedicaDetalle {
    private int idCitaMedica;
    private String fecha;
    private String especialidad;
    private String nombres;
    private String apPaterno;
    private String apMaterno;

    public clsCitaMedicaDetalle() {
    }

    public clsCitaMedicaDetalle(int idCitaMedica, String fecha, String especialidad, String nombres, String apPaterno, String apMaterno) {
        this.idCitaMedica = idCitaMedica;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEspecialidad() {
        return especialidad;
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
    
    
}
