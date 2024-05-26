/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public abstract class clsArte {
    private String codigo;
    private String descripcion;
    private String lugardeprocedencia;
    protected double precio;
    private int antiguedad;
    protected int tipo;    

    public clsArte() {
    }

    public clsArte(String codigo, String descripcion, String lugardeprocedencia, double precio, int antiguedad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.lugardeprocedencia = lugardeprocedencia;
        this.precio = precio;
        this.antiguedad = antiguedad;
    }        

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugardeprocedencia() {
        return lugardeprocedencia;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAntiguedad() {
        return antiguedad;
    } 

    public int getTipo() {
        return tipo;
    } 
    
    public String mostrar(){
        return this.codigo+" - "+this.lugardeprocedencia+" - "+this.precio;
    }
    
    public abstract void calcularDescuento();        
}
