/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsEvaluacion {
    private String descripcion;
    private int tipo;            //tabla estatica.
    private float nota;
    
    public clsEvaluacion(){        
    }
    public clsEvaluacion(String descripcion, int tipo, float nota){ 
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public float getNota() {
        return nota;
    }
        
    String mostrar(){
        return descripcion+"-"+tipo+"-"+nota;
    }
}

/*
1-Completar la clase evaluacion
2-Construir un claselistaEvaluacion
3-Agregar un objeto listaEvaluacion en el alumno
4-Agregar en el menu de opciones :
    -registrar una evaluacion en un alumno
    -presentar un alumno, mostrar todas sus evaluaciones.
*/