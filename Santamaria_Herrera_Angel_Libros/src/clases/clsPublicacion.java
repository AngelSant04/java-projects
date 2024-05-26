/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public abstract class clsPublicacion {
    private String titulo;
    private String editorial;
    private int aniopublicacion;
    protected double precio;
    
    public clsPublicacion() {
        this.precio = 0;
    }

    public clsPublicacion(String titulo, String editorial, int aniopublicacion) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.aniopublicacion = aniopublicacion;
        this.precio = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }   

    public double getPrecio() {
        return precio;
    }          
    
    public String mostrar(){
        return this.titulo+" - "+this.aniopublicacion+" - "+this.editorial;
    }
    
    public abstract void calcularPrecio(double precio);
        
}
