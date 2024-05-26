/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_paquetes;

import Pack_Personal.clsDocente;



public class Main {

    public static void main(String[] args) {
        
        clsDocente objDocente = new clsDocente();
        
        System.out.println("Hola mundo");
        System.out.println("Bienvenido");
        System.out.println("Hola "+objDocente.nombre);
    }
    
}
