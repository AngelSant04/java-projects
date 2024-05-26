/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USER
 */
public class clsCtaCorriente extends clsCuenta {
    String RUP;
    float mantenimiento;

    public clsCtaCorriente(String solicitante, int DNI, int tipo, int clave,String RUP,float capital) {
        super(solicitante, DNI, tipo, clave,capital);
        this.mantenimiento=(float) 0.05;
        this.RUP=RUP;
    }
    

    @Override
    public String mostrar(){
        return super.mostrar()+"\n"+"RUP:"+this.RUP+"\n";
    }

    @Override
    public void deposito(float deposito) {
        deposito=deposito-(mantenimiento*deposito);
        this.capital=this.capital+deposito;
    }
    @Override
    public void retiro(float retiro) {
        retiro=retiro+(mantenimiento*retiro);
        this.capital=this.capital-retiro;
    }
    
}
