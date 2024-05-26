/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaContenido {
    private final int MAX = 10;
    private int contador;
    private clsContenido datos[];
    
    public clsListaContenido(){
        this.contador = 0;
        datos = new clsContenido[MAX];
    }
    
    public void insertar(clsContenido obj){
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

    public clsContenido[] getDatos() {
        return datos;
    }
    
}
