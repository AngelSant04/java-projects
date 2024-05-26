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

public class clsVentana {
    JFrame ventana;

    public clsVentana() {
        ventana = new JFrame("Mi Ventana");
        ventana.setSize(500, 400);
        agregarComponentes();
    }
    
    public void agregarComponentes(){
        JLabel etiqueta;
        JTextField cajaTexto;
        JButton boton;
                
        ventana.setLayout(null);
        etiqueta = new JLabel("Ingrese nombre: ");
        etiqueta.setBounds(30, 30, 200, 30);
        
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 80, 200, 30);
        
        //Configurado de sus propiedades
        boton = new JButton("Mostrar");
        boton.setBounds(50, 130, 100, 30);
        //COnfigurar ESCUCHADOR(Listener) del evento click
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Boton pulsado");
                JOptionPane.showMessageDialog(ventana, "Bienvenido "+cajaTexto.getText());
                cajaTexto.setText("");
            }
        });        
        
        ventana.add(etiqueta);
        ventana.add(cajaTexto);
        ventana.add(boton);
    }
    
    public void mostrar(){
        ventana.setVisible(true);
    }            
    
    
}
