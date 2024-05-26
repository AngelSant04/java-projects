/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.IOperaciones;

public class clsPersona implements IOperaciones{
    
    private int pasos;
    
    @Override
    public void avanzar(int valor) {
        this.pasos = this.pasos + valor;
    }

    @Override
    public void retroceder() {
        this.pasos = this.pasos - 1;
    }

    @Override
    public void avanzarDiagonal() {
    }
    
}
