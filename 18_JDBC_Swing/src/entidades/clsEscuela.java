/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class clsEscuela {
    private int idEscuela;
    private String descripcion;
    private String director;
    private String year;

    public clsEscuela() {
    }

    public clsEscuela(int idEscuela, String descripcion, String director, String year) {
        this.idEscuela = idEscuela;
        this.descripcion = descripcion;
        this.director = director;
        this.year = year;
    }

    public int getIdEscuela() {
        return idEscuela;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
