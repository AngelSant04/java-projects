/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_interfaces;

import clases.clsAuto;

public class Main {
 
    public static void main(String[] args) {
        clsAuto auto = new clsAuto();       
        auto.avanzar(50);
        auto.avanzar(80);
        System.out.println(auto.toString());
    }
    
}
