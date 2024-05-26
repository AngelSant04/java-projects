
package clases;

import java.awt.Graphics;


public abstract class clsFigura2D {
    private clsPunto p1x1 ;
    private clsPunto p1y1 ; 
    private String nombre ; 
    protected double Dibujar ; 
    
    public clsFigura2D(){
        
    }
    
    public clsFigura2D(clsPunto p1x1 ,clsPunto p1y1, String nombre ){
        this.p1x1 = p1x1 ;
        this.p1y1 = p1y1 ;
        this.nombre = nombre ; 
    }

    public clsPunto getP1x1() {
        return p1x1;
    }

    public void setP1x1(clsPunto p1x1) {
        this.p1x1 = p1x1;
    }

    public clsPunto getP1y1() {
        return p1y1;
    }

    public void setP1y2(clsPunto p1y1) {
        this.p1y1 = p1y1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*
    public double getDibujar() {
        return Dibujar;
    }

    public void setDibujar(double Dibujar) {
        this.Dibujar = Dibujar;
    }*/
    
    
    
     
    public String mostrar (){
        return this.mostrar();
    }
    
    public abstract void Dibujar(Graphics g);
    
}