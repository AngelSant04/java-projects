 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaCanal {
    private final int MAX = 10;
    private int contador;
    private clsCanal datos[];
    
    public clsListaCanal(){
        this.contador = 0;
        datos = new clsCanal[MAX];
    }
    
    public void insertar(clsCanal obj){
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

    public clsCanal[] getDatos() {
        return datos;
    }
    
    public int buscarcanal(String nombre){
        for (int i = 0; i < this.contador; i++) {
            if(this.datos[i].getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }
}
