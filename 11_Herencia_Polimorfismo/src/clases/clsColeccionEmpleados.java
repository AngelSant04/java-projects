/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsColeccionEmpleados {
    
    final int MAX = 10;
    private int total;
    private clsEmpleado datos[];

    public clsColeccionEmpleados() {
        this.total = 0;
        this.datos = new clsEmpleado[MAX];
    }
    
    public void insertar(clsEmpleado obj){
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
    
    public void calcularSueldo(){
        for (int i = 0; i < total; i++) {
            datos[i].calcularSueldo();
        }
    }    
    
    public void incrementoBono(){
        for (int i = 0; i < total; i++) {
            datos[i].nuevoBono(200);
        }
    }
}
