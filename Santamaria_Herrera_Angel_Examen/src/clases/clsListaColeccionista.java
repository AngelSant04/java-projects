/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaColeccionista {
    final int MAX = 10;
    private int total;
    private clsColeccionista datos[];

    public clsListaColeccionista() {
        this.total = 0;
        this.datos = new clsColeccionista[MAX];
    }
    
    public void insertar(clsColeccionista obj){
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
    
    public int buscarColeccionista(String codigo){
        for (int i = 0; i < total; i++) {
            if((datos[i].getIdentificador()).equals(codigo)){
                return i;                
            }
        }        
        return -1;
    }

    public clsColeccionista[] getDatos() {
        return datos;
    }

    public int getTotal() {
        return total;
    }
    
    
}
