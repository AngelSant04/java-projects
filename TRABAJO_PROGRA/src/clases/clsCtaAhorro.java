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
public class clsCtaAhorro extends clsCuenta{
    float seguro;
    int maxop;
    public clsCtaAhorro(String solicitante, int DNI, int tipo, int clave,float seguro,float capital) {
        super(solicitante, DNI, tipo, clave,capital);
        this.seguro=seguro;
        this.maxop=0;
    }

    public float getSeguro() {
        return seguro;
    }

    public int getMaxop() {
        return maxop;
    }
    @Override
    public String mostrar(){
        return super.mostrar()+"\n"+"AFILICION A SEGURO:"+seguro+"\n";
    }

    @Override
    public void deposito(float deposito) {
        if(maxop!=6){
        deposito=deposito-(seguro*deposito);
        this.capital=this.capital+deposito;
        maxop++;
        }
    }

    @Override
    public void retiro(float retiro) {
        if(maxop!=6){
        retiro=retiro+(seguro*retiro);
        this.capital=this.capital-retiro;
        maxop++;
        }
    }


}
