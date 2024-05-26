/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.IOperaciones;

public class clsAuto implements IOperaciones{

    private int velocidad; 
    
    @Override
    public void avanzar(int valor) {
        this.velocidad = this.velocidad + valor;
    }

    @Override
    public void retroceder() {
        this.velocidad = this.velocidad - 20;
    }

    @Override
    public void avanzarDiagonal() {
    }

    @Override
    public String toString() {
        return this.velocidad + " kilometros";
    }        
    
}
