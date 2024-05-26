/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsLibro extends clsPublicacion {
    private String autor;
    private int codigo;
    private int numerocapitulos;

    public clsLibro() {
    }

    public clsLibro(String autor, int codigo, int numerocapitulos, String titulo, String editorial, int fechapublicacion) {
        super(titulo, editorial, fechapublicacion);
        this.autor = autor;
        this.codigo = codigo;
        this.numerocapitulos = numerocapitulos;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumerocapitulos() {
        return numerocapitulos;
    }      
    
    @Override
    public String mostrar(){
        return super.mostrar()+" - "+this.autor+" - "+this.numerocapitulos+" - "+this.codigo+" - "+this.precio;
    }
    
    @Override
    public void calcularPrecio(double precio) {
        this.precio = precio;
    }    
}
