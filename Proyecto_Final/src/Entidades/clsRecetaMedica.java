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
public class clsRecetaMedica {
    private int idReceta;
    private String descripcion;
    private String presentacion;
    private int idCitaMedica;

    public clsRecetaMedica() {
    }

    public clsRecetaMedica(int idReceta, String descripcion, String presentacion, int idCitaMedica) {
        this.idReceta = idReceta;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.idCitaMedica = idCitaMedica;
    }        

    public int getIdReceta() {
        return idReceta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

           
    
}
