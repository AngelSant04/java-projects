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
public class clsDetalleMatricula {
    private int idDetalle;
    private int nota;
    private int idMatricula;
    private int idCurso;

    public clsDetalleMatricula() {
    }

    public clsDetalleMatricula(int idDetalle, int nota, int idMatricula, int idCurso) {
        this.idDetalle = idDetalle;
        this.nota = nota;
        this.idMatricula = idMatricula;
        this.idCurso = idCurso;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public int getNota() {
        return nota;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }
    
    
   
}
