
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class clsTriangulo extends clsFigura2D{
    private int base = 0;
    private int altura = 0 ;

    public clsTriangulo() {
    }

    public clsTriangulo(clsPunto p1x1, clsPunto p1y1, String nombre) {
        super(p1x1, p1y1, nombre);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    


    
    
   @Override
    public String mostrar() {
        return super.mostrar()+base+altura;
    }

    @Override
    public void Dibujar(Graphics g) {
       
     
        //Para poder modificar más propiedades
    Graphics2D g2d = (Graphics2D) g;
     
     g2d.setColor(Color.white);
     g2d.setStroke(new BasicStroke(5));
     g2d.drawLine(60, 60, 60+(100/2), 60+100);
     g2d.drawLine(65+(100/2), 65+100, 65-(150/2), 65+100);
     g2d.drawLine(56,56,56-(100/2), 56+100);
     
    }
    /* public void pintar(Graphics g){
  if(base!=0 && alto!=0){
   g.drawLine(x, y, x+(base/2), y+alto);
   g.drawLine(x+(base/2), y+alto, x-(base/2), y+alto);
   g.drawLine(x,y,x-(base/2), y+alto);
  }  formula para dibujar triangulo */
}
