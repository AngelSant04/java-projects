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
public class clsCitaMedica {
    private int idCitaMedica;
    private String fecha; 
    private String diagnostico;    
    private int idAtencionMedica;
    private int idServicioMedico;
    
    private String idDoctor;

    public clsCitaMedica() {
    }

    public clsCitaMedica(int idCitaMedica, String fecha, String diagnostico, int idAtencionMedica, int idServicioMedico, String idDoctor) {
        this.idCitaMedica = idCitaMedica;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.idAtencionMedica = idAtencionMedica;
        this.idServicioMedico = idServicioMedico;
        this.idDoctor = idDoctor;
    }            

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public int getIdServicioMedico() {
        return idServicioMedico;
    }

    public int getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public void setIdAtencionMedica(int idAtencionMedica) {
        this.idAtencionMedica = idAtencionMedica;
    }

    
    
}
