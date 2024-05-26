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
public class clsCurso {
    private int idCurso;
    private String nombre;
    private int creditos;
    private String ciclo;

    public clsCurso() {
    }

    public clsCurso(int idCurso, String nombre, int creditos, String ciclo) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCiclo() {
        return ciclo;
    }
    
    
}
