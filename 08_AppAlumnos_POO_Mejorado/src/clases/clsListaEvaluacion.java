/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaEvaluacion {
    
    private final int MAX = 10;
    private int contador;
    private clsEvaluacion datos[];
    
    public clsListaEvaluacion(){
        this.contador = 0;
        datos = new clsEvaluacion[MAX];
    }
    
    public void insertar(clsEvaluacion obj){
        datos[contador] = obj;
        contador++;
    }
    
    public String presentar(){
        String contenido = "";
        for (int i = 0; i < this.contador; i++) {
            contenido = contenido+datos[i].mostrar()+"\n";
        }
        return contenido;
    }

    public int getContador() {
        return contador;
    }

    public clsEvaluacion[] getDatos() {
        return datos;
    }
        
    
}
