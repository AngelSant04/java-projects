
package clases;

import java.util.Scanner;
public class clsColeccionFigura {
    final int MAX = 10;
    private int total;
    private clsFigura2D datos[];

    public clsColeccionFigura() {
        this.total = 0;
        this.datos = new clsFigura2D[MAX];
    }

    public void insertar(clsFigura2D obj){
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
    
    public clsFigura2D[] getDatos() {
        return datos;
    } 
    
    
    
    public void Dibujar(){
        
        }
    
    
    
    /* public String getMostrar(int codigoAux){
        for (int i = 0; i < total; i++) {
            if(this.datos[i].getCodigo()==(codigoAux)){
                return this.datos[i].mostrar();
            }
        }
        return "Figura no encontrada ";
    }*/
}

