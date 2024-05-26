
package grafico;


import clases.clsCirculo;
import clases.clsColeccionFigura;
import clases.clsFigura2D;
import clases.clsLinea;
import clases.clsPunto;
import clases.clsRectangulo;
import clases.clsTriangulo;


import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.PopupMenu;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


public class Grafico extends JFrame{
    public Grafico(){
        intPanel();
        ventana();
    }
    static JPanel panel;
    
    public void ventana(){
        setSize(1000, 500); //Establecer el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// para que finalice el programa al cerrar la ventana
        setTitle("Herencia Grafica"); //titulo de la ventana  
        setResizable(false);
        setVisible(true);
        }
    private void intPanel(){
        panel = new JPanel(); //Inicializo panel
        add(panel); //Lo añado al JFrame
        panel.setPreferredSize(new Dimension(1000,1000)); //Establezco dimensiones del panel
    }

    
   public static void main(String[] args)  {
              
       Grafico g = new Grafico();
       
       Scanner lector = new Scanner(System.in);
       
        Scanner sn = new Scanner(System.in);
        boolean salir = false ;
        
        int opcion; 
        int op ;
        while(!salir){
            
        op = Integer.parseInt(JOptionPane.showInputDialog("---Agregue la figura que desee:--- \n1.- Agregar Linea \n.2- Agregar Circulo "
                + "\n3.-Agregar Rectangulo \n4.-Agregar Triangulo \nELEGIR OPCION: "));
            
        opcion = (op);
        clsColeccionFigura objetoCjd = new clsColeccionFigura();
      
     
        clsColeccionFigura coleccion = new clsColeccionFigura(); 
        
      
                 
        switch(opcion){
           
               case 1:
                   clsLinea objL = new clsLinea ();
                   Graphics l = panel.getGraphics();
                   objL.Dibujar(l);
                   break;



               case 2:
                   clsCirculo objC = new clsCirculo ();
                   Graphics c = panel.getGraphics();
                   objC.Dibujar(c) ;
                   
                   break;
                case 3:
                    clsRectangulo objR = new clsRectangulo ();
                    Graphics r = panel.getGraphics();
                    objR.Dibujar(r);
                   
                   break;
                case 4:
                    clsTriangulo objT = new clsTriangulo ();
                    Graphics t = panel.getGraphics();
                    objT.Dibujar(t);
                    
                case 5:
                   salir=true;
                   break;
                default:
                   JOptionPane.showInputDialog(null,("Solo números entre 1 y 4"));
         
        }
        
          objetoCjd.Dibujar();
        
              System.out.println(objetoCjd.presentar());
            }
    

    

        
        
      }
}
       
  

     
 
    
    

