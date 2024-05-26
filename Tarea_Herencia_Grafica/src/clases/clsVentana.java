/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class clsVentana extends JFrame{

    public clsVentana(){
        this.setSize(600, 300);
        agregarComponentes();   
    }
    
    public void agregarComponentes(){
        JLabel etiqueta1;
        JLabel etiqueta2;
        JTextField cajaTexto1;
        JTextField cajaTexto2;
        JButton boton1;
        JButton boton2;
        JButton boton3;
        JButton boton4;
                
        this.setLayout(null);
        etiqueta1 = new JLabel("Numero 1: ");
        etiqueta1.setBounds(150, 30, 100, 30);
        
        etiqueta2 = new JLabel("Numero 2: ");
        etiqueta2.setBounds(150, 80, 200, 30);
        
        cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(220, 30, 190, 30);
        
        cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(220, 80, 190, 30);
        
        boton1 = new JButton("SUMAR");
        boton1.setBounds(50, 130, 100, 30);
        boton2 = new JButton("RESTAR");
        boton2.setBounds(160, 130, 100, 30);
        boton3 = new JButton("MULTIPLICAR");
        boton3.setBounds(270, 130, 130, 30);
        boton4 = new JButton("DIVIDIR");
        boton4.setBounds(410, 130, 100, 30);
        
        this.add(etiqueta1);
        this.add(cajaTexto1);
        this.add(etiqueta2);
        this.add(cajaTexto2);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4); 
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(ventana, "Boton pulsado");
                JOptionPane.showMessageDialog(null, "La Suma es: "+
                    (Integer.parseInt(cajaTexto1.getText())+Integer.parseInt(cajaTexto2.getText())));
                cajaTexto1.setText("");
                cajaTexto2.setText("");                                
            }
        });
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(ventana, "Boton pulsado");
                JOptionPane.showMessageDialog(null, "La Resta es: "+
                    (Integer.parseInt(cajaTexto1.getText())-Integer.parseInt(cajaTexto2.getText())));
                cajaTexto1.setText("");
                cajaTexto2.setText("");
            }
        });
        
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(ventana, "Boton pulsado");
                JOptionPane.showMessageDialog(null, "La Multiplicacion es: "+
                    (Integer.parseInt(cajaTexto1.getText())*Integer.parseInt(cajaTexto2.getText())));
                cajaTexto1.setText("");
                cajaTexto2.setText("");
            }
        });
        
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(ventana, "Boton pulsado");
                JOptionPane.showMessageDialog(null, "La Division es: "+
                    (Integer.parseInt(cajaTexto1.getText())/Integer.parseInt(cajaTexto2.getText())));
                cajaTexto1.setText("");
                cajaTexto2.setText("");
            }
        });
    }
    
    public void mostrar(){
        this.setTitle("VENTANA DE OPERACIONES");
        this.setVisible(true);
    }    
    
}
