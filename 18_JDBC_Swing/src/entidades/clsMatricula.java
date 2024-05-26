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
public class clsMatricula {
    private int idMatricula;
    private String fecha;
    private int totalCreditos;
    private String codigoAlumno;

    public clsMatricula() {
    }

    public clsMatricula(int idMatricula, String fecha, int totalCreditos, String codigoAlumno) {
        this.idMatricula = idMatricula;
        this.fecha = fecha;
        this.totalCreditos = totalCreditos;
        this.codigoAlumno = codigoAlumno;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public String getFecha() {
        return fecha;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }
    
    
    
}
