/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsTrabajo {
    private String dni;
    private String labor;   //que hace?
    private int horas;
    private String areaTrabajo; //Gerencia;Seguridad;Recepcion
    private String id;

    public clsTrabajo() {
    }

    public clsTrabajo(String id, String dni, String labor, int horas, String areaTrabajo) {
        this.dni = dni;
        this.labor = labor;
        this.horas = horas;
        this.areaTrabajo = areaTrabajo;
        this.id = id;
    }
    
    public clsTrabajo(String dni, String labor, int horas, String areaTrabajo) {
        this.dni = dni;
        this.labor = labor;
        this.horas = horas;
        this.areaTrabajo = areaTrabajo;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    

    public String getDni() {
        return dni;
    }

    public String getLabor() {
        return labor;
    }

    public int getHoras() {
        return horas;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    @Override
    public String toString() {
        return this.id +" - "+this.labor + " - " + this.horas + " - "+this.areaTrabajo; 
    }
    
    

    
}
