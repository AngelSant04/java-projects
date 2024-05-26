
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class clsRectangulo extends clsFigura2D{
    
    private double ancho ; 
    private double largo ; 
    
    public clsRectangulo(){
        
    }

    public clsRectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public clsRectangulo(double ancho, double largo, clsPunto p1x1, clsPunto p1y1, String nombre) {
        super(p1x1, p1y1, nombre);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    
    
    
     @Override
    public String mostrar() {
        return super.mostrar()+ancho+largo;
    }
    
    @Override
    public void Dibujar(Graphics g) {
       //Para poder modificar más propiedades
    Graphics2D g2d = (Graphics2D) g;
     
     g2d.setColor(Color.orange);
     g2d.setStroke(new BasicStroke(5));
     g2d.drawRect(350, 0, 350, 300);
    
    }
    
}
