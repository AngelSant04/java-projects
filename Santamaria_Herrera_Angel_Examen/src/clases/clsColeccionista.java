/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsColeccionista {
    private String identificador;
    private String nombre;
    private int categoria;
    private clsColeccionArte coleccion;

    public clsColeccionista() {
        this.coleccion = new clsColeccionArte();
    }

    public clsColeccionista(String identificador, String nombre, int categoria) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.coleccion = new clsColeccionArte();
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public clsColeccionArte getColeccion() {
        return coleccion;
    }
    
    public String mostrar(){
        return this.identificador+" - "+this.nombre+" - "+clsConstantes.CATEGORIA_COLECCIONISTA[(this.categoria-1)]+"\n";
    }
    
}
