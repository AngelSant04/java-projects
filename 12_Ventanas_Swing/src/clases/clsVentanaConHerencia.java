/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class clsVentanaConHerencia extends JFrame{

    public clsVentanaConHerencia(){
        this.setSize(500, 400);
        agregarComponentes();        
    }
    
    public void agregarComponentes(){
        JLabel etiqueta;
        JTextField cajaTexto;
        JButton boton;
                
        this.setLayout(null);
        etiqueta = new JLabel("Ingrese nombre: ");
        etiqueta.setBounds(30, 30, 200, 30);
        
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 80, 200, 30);
        
        boton = new JButton("Mostrar");
        boton.setBounds(50, 130, 100, 30);
        
        this.add(etiqueta);
        this.add(cajaTexto);
        this.add(boton);
    }
    
    public void mostrar(){
        this.setTitle("Mi Ventana");
        this.setVisible(true);
    } 
    
}
