/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class clsVentana extends JFrame implements ActionListener{
    JPanel panel;
    JLabel etiqueta;
    JLabel etiquetaAux1 = new JLabel();
    JLabel etiquetaAux2 = new JLabel(); 
    JLabel etiquetaAux3 = new JLabel(); 
    JLabel resultado;
    JButton botonC;
    JButton botonFlecha;
    JButton botonSuma;
    JButton botonResta;
    JButton botonMultiplicacion;
    JButton botonDivision;  
    JButton boton0;
    JButton botonNumero[];
    JButton botonIgual;
    int operacion; 
    int band = 0;
    
    public clsVentana(){
        setSize(310, 300);                        //Tamaño
        setTitle("CALCULADORA");                  //Titulo
        setLocationRelativeTo(null);              //localizacion de la ventana (MEDIO)
        agregarComponentes();                     //metodo
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Presionas X y se cierra programa
    }
    
    private void agregarComponentes(){
        panel = new JPanel();                      //Creamos Panel
        //panel.setBackground(Color.GRAY);           //Color panel
        panel.setLayout(null);                     //Desactivas configuracion de diseño
        this.getContentPane().add(panel);          //Agregamos el panel a la ventana
        //METODOS
        agregarEtiqueta();        
        agregarBotonesCaracter();
        agregarBotonesNumericos();
    }
    
    private void agregarEtiqueta(){
        etiqueta = new JLabel();                   //Instanciar Etiqueta
        //etiqueta.setText("hola");        
        etiqueta.setBounds(20, 10, 255, 80);       //Tamaño de etiqueta
        //Cambiar el color
        etiqueta.setOpaque(true);                  //Como si fuera un setLayaout
        etiqueta.setBackground(Color.WHITE);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));     //Establecemos fuente del texto
        etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(etiqueta);                       //En el panel agregamos la etiqueta
    }
    
    private void agregarBotonesNumericos(){
        
        botonNumero = new JButton[9];
        int x1 = 20;
        int x2 = 20;
        int x3 = 20;
        
        boton0 = new JButton("0");
        boton0.setBounds(20, 220, 95, 30);
        boton0.addActionListener(this); 
        
        for (int i = 0; i < 9; i++) {
            if(i <= 2){
                botonNumero[i] = new JButton(""+(i+1)+"");
                botonNumero[i].setBounds(x1, 100,45,30);                
                x1 = x1+50;
            }else{
                if(i <= 5){
                    botonNumero[i] = new JButton(""+(i+1)+"");
                    botonNumero[i].setBounds(x2, 140,45,30);
                    x2 = x2+50;
                }else{
                    botonNumero[i] = new JButton(""+(i+1)+"");
                    botonNumero[i].setBounds(x3, 180,45,30);
                    x3 = x3+50;
                }
            }
            botonNumero[i].addActionListener(this);             //Cada Boton tiene una evento(Accion)
            panel.add(botonNumero[i]);                          //Agregamos al panel los botones
        }                                      
        panel.add(boton0);        
    }
    
    private void agregarBotonesCaracter(){                              
        
        botonC = new JButton("C");
        botonC.setBounds(120, 220, 45, 30);
        botonC.addActionListener(this);
        
        botonFlecha = new JButton("←");
        botonFlecha.setBounds(225, 100, 50, 30);
        botonFlecha.addActionListener(this);
        
        botonSuma = new JButton("+");
        botonSuma.setBounds(170, 100, 50, 30);
        botonSuma.addActionListener(this);
        
        botonResta = new JButton("-");
        botonResta.setBounds(170, 140, 50, 30);
        botonResta.addActionListener(this);
        
        botonDivision = new JButton("/");
        botonDivision.setBounds(170, 180, 50, 30);
        botonDivision.addActionListener(this);
        
        botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(170, 220, 50, 30);
        botonMultiplicacion.addActionListener(this); 
        
        botonIgual = new JButton("=");
        botonIgual.setBounds(225, 140, 50, 110);
        botonIgual.addActionListener(this);   
        
        panel.add(botonC);
        panel.add(botonFlecha);
        panel.add(botonSuma);
        panel.add(botonResta);
        panel.add(botonDivision);
        panel.add(botonMultiplicacion);
        panel.add(botonIgual);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == boton0){                //Lee Click           
            StringBuilder Texto = new StringBuilder();  //16 caracteres
            Texto.append(etiqueta.getText());
            Texto.append(boton0.getText());
            etiqueta.setText(Texto.toString());        
        }
        
        for (int i = 0; i < 9; i++) {
            if(e.getSource() == botonNumero[i]){
                StringBuilder Texto = new StringBuilder();
                Texto.append(etiqueta.getText());
                Texto.append(botonNumero[i].getText());
                etiqueta.setText(Texto.toString());   
            }                        
        }
        
        if(e.getSource() == botonSuma){
            etiquetaAux1.setText(etiqueta.getText());
            etiqueta.setText(""); 
            band = 1;
        }
        
        if(e.getSource() == botonResta){
            etiquetaAux1.setText(etiqueta.getText());
            etiqueta.setText(""); 
            band = 2;
        }
        
        if(e.getSource() == botonMultiplicacion){
            etiquetaAux1.setText(etiqueta.getText());
            etiqueta.setText(""); 
            band = 3;
        }
        
        if(e.getSource() == botonDivision){
            etiquetaAux1.setText(etiqueta.getText());
            etiqueta.setText(""); 
            band = 4;
        }
        
        if(e.getSource() == botonIgual){
            if(etiqueta.getText().equals("")){
                etiqueta.setText("");
            }else{
                /*if(band == 1){
                    etiquetaAux2.setText(etiqueta.getText());
                    if(etiquetaAux3.getText().equals("")){
                        operacion = Integer.parseInt(etiquetaAux1.getText()) + Integer.parseInt(etiquetaAux2.getText());   
                        etiquetaAux3.setText(etiquetaAux2.getText());
                    }else{
                        operacion = Integer.parseInt(etiquetaAux3.getText()) + Integer.parseInt(etiquetaAux2.getText());   
                    }                     
                    etiqueta.setText(Integer.toString(operacion));
                }*/
                
                if(band == 1){
                    etiquetaAux2.setText(etiqueta.getText());
                    operacion = Integer.parseInt(etiquetaAux1.getText()) + Integer.parseInt(etiquetaAux2.getText());                    
                    etiqueta.setText(Integer.toString(operacion));
                }
            
                if(band == 2){
                    etiquetaAux2.setText(etiqueta.getText());
                    operacion = Integer.parseInt(etiquetaAux1.getText()) - Integer.parseInt(etiquetaAux2.getText());                    
                    etiqueta.setText(Integer.toString(operacion));
                }
            
                if(band == 3){
                    etiquetaAux2.setText(etiqueta.getText());
                    operacion = Integer.parseInt(etiquetaAux1.getText()) * Integer.parseInt(etiquetaAux2.getText());                    
                    etiqueta.setText(Integer.toString(operacion));
                }
            
                if(band == 4){
                    etiquetaAux2.setText(etiqueta.getText());
                    double operacionD = Double.parseDouble(etiquetaAux1.getText()) / Double.parseDouble(etiquetaAux2.getText());
                    String operacionS = String.valueOf(operacionD);
                    etiqueta.setText(operacionS);
                }
            }             
        }
        
        if(e.getSource() == botonC){
            etiqueta.setText("");
        }
        
        if(e.getSource() == botonFlecha){
            if(etiqueta.getText().equals("")){
                etiqueta.setText("");
            }else{
                StringBuilder Texto = new StringBuilder();
                Texto.append(etiqueta.getText());
                Texto.deleteCharAt(Texto.length()-1);
                etiqueta.setText(Texto.toString()); 
            }            
        }
    }
}