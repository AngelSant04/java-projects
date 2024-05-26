/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class clsLista {
    
    private final int MAX = 10;
    private int contador;
    private clsPrueba datos[];

    public clsLista() {
        this.contador = 0;
        datos = new clsPrueba[MAX];
    }
    
    public void insertar(clsPrueba obj){
        datos[contador] = obj;
        contador++;
    }
    
    public String presentar(){
        String contenido = "";
        for (int i = 0; i < this.contador; i++) {
            contenido = contenido+datos[i].leer()+"\n";
        }
        return contenido;
    }
    
}
