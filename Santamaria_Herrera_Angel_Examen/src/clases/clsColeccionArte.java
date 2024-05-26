/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsColeccionArte {
    final int MAX = 10;
    private int total;
    private clsArte datos[];

    public clsColeccionArte() {
        this.total = 0;
        this.datos = new clsArte[MAX];
    }
    
    public void insertar(clsArte obj){
        datos[total] = obj;
        total++;
    }
    
    public String presentar(){
        String contenido = "";
        for (int i = 0; i < total; i++) {
            contenido = contenido+ datos[i].mostrar() +"\n";
        }
        return contenido;
    }

    public int getTotal() {
        return total;
    }

    public clsArte[] getDatos() {
        return datos;
    }
    
    
    
}
