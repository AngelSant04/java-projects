/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsAuto {
    //public static final String COLOR_AUTO[] = {"ROJO","AZUL","VERDE","MARRON"}; //FINAL =CONSTANTE.
                                                //0-3
    private String placa;
    private String marca;
    private int color;
    public static int contador = 0;
    
    public clsAuto(){
        contador++;
    }
    
    public clsAuto(String placa, String marca, int color){
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        contador++;
    }
    
    public clsAuto(String marca){
        this.marca = marca;
        contador++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getColor() {
        return color;
    }
    
    
}
