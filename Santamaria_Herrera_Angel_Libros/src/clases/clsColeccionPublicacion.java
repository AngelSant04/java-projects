/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsColeccionPublicacion {
    final int MAX = 10;
    private int total;
    private clsPublicacion datos[];

    public clsColeccionPublicacion() {
        this.total = 0;
        this.datos = new clsPublicacion[MAX];
    }

    public void insertar(clsPublicacion obj){
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

    public int getMAX() {
        return MAX;
    }

    public int getTotal() {
        return total;
    }
    
    public clsPublicacion[] getDatos() {
        return datos;
    } 
    
    public String getMostrar(String tituloAux){
        for (int i = 0; i < total; i++) {
            if(this.datos[i].getTitulo().equals(tituloAux)){
                return this.datos[i].mostrar();
            }
        }
        return "Titulo no encontrado";
    }           
    
}
