/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_elementos_estaticos;

import clases.clsAuto;
import clases.clsConstantes;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        clsAuto auto1, auto2, auto3;
        
        auto1 = new clsAuto("P001","NISSAN",1);
        auto2 = new clsAuto();
        auto3 = new clsAuto("Tico");
        
        System.out.println("Marca del auto: "+auto1.getMarca());
        System.out.println("Marca del auto: "+auto2.getMarca());
        System.out.println("Marca del auto: "+auto3.getMarca());    
        
        System.out.println("Total de autos: "+clsAuto.contador);
        
        System.out.println("Color del auto 1: "+clsConstantes.COLOR_AUTO[auto1.getColor()]);
        System.out.println("Color del auto 2: "+clsConstantes.COLOR_AUTO[auto2.getColor()]);
        System.out.println("Color del auto 3: "+clsConstantes.COLOR_AUTO[auto3.getColor()]);                
        
        JOptionPane.showMessageDialog(null, clsConstantes.COLOR_AUTO[auto3.getColor()]);
        
    }
    
}
