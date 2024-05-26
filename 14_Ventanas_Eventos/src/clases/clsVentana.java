/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class clsVentana extends JFrame implements ActionListener, KeyListener{
    
    JLabel etiqueta;
    JTextField cajaTexto;
    JButton boton;
    JButton boton1;
    

    public clsVentana(){
        this.setTitle("MI ventana");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);        
        agregarComponentes();
    }        
    
    public void agregarComponentes(){        
        this.setLayout(null);   //Permite ubicar libremente los componentes
        etiqueta = new JLabel("Ingrese nombre: ");
        etiqueta.setBounds(30, 30, 200, 30);
        
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 80, 200, 30);
        cajaTexto.addKeyListener(this);
        
        boton = new JButton("Mostrar");
        boton.setBounds(50, 130, 100, 30);
        boton.addActionListener(this);
        
        boton1 = new JButton("Limpiar");
        boton1.setBounds(160, 130, 100, 30);
        boton1.addActionListener(this);
        
        this.add(etiqueta);
        this.add(cajaTexto);
        this.add(boton);
        this.add(boton1);
    }        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){     //e.getSource() = lee el Origen del Click
            JOptionPane.showMessageDialog(rootPane, "Boton mostrar presionado");
            if(!cajaTexto.getText().equals(""))
                JOptionPane.showMessageDialog(rootPane, "Bienvenido" + cajaTexto.getText());
            else 
                JOptionPane.showMessageDialog(rootPane, "DEBE INGRESAR UN NOMBRE");
        }
        if(e.getSource() == boton1){
            JOptionPane.showMessageDialog(rootPane, "Boton limpiar presionado");
            cajaTexto.setText("");
            
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.setTitle(cajaTexto.getText());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
