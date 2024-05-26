
package clases;


import clases.clsPunto;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;


public class clsLinea extends clsFigura2D {

    
    private clsPunto p2x2 ;
    private clsPunto p2y2 ;

    public clsLinea() {
    }
   
    
    public clsLinea(clsPunto p2x2, clsPunto p2y2) {
        this.p2x2 = p2x2;
        this.p2y2 = p2y2;
    }

    public clsLinea(clsPunto p2x2, clsPunto p2y2, clsPunto p1x1, clsPunto p1y1, String nombre) {
        super(p1x1, p1y1, nombre);
        this.p2x2 = p2x2;
        this.p2y2 = p2y2;
    }  

    public clsPunto getP2x2() {
        return p2x2;
    }

    public void setP2x2(clsPunto p2x2) {
        this.p2x2 = p2x2;
    }

    public clsPunto getP2y2() {
        return p2y2;
    }

    public void setP2y2(clsPunto p2y2) {
        this.p2y2 = p2y2;
    }
    
    

    @Override
    public String mostrar() {
        return super.mostrar()+p2x2+p2y2;
    }

    @Override
    public void Dibujar(Graphics g) {
       
     
        //Para poder modificar más propiedades
    Graphics2D g2d = (Graphics2D) g;
     
     g2d.setColor(Color.BLUE);
     g2d.setStroke(new BasicStroke(5));
     g2d.drawLine(30, 70, 770, 70);
     
    }
    

    

    
    
}
