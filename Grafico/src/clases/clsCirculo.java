
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import clases.clsPunto;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class clsCirculo extends clsFigura2D {
    
    private double radio ; 
    
    public clsCirculo (){
        
    }

    public clsCirculo(double radio) {
        this.radio = radio;
    }

    public clsCirculo(double radio, clsPunto p1x1, clsPunto p1y1, String nombre) {
        super(p1x1, p1y1, nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String mostrar() {
        return super.mostrar()+ radio ; 
        
    }
    
    @Override
    public void Dibujar(Graphics g) {
       //Para poder modificar más propiedades
    Graphics2D g2d = (Graphics2D) g;
     
     g2d.setColor(Color.RED);
     g2d.setStroke(new BasicStroke(5));
     g2d.drawOval(100, 100, 100, 100);  
    }
}

