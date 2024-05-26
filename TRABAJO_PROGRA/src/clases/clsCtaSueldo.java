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
public class clsCtaSueldo extends clsCuenta {
    String empleador;
    float sueldo;
    String RUPemp;
    float mantenimiento;

    public clsCtaSueldo(String solicitante, int DNI, int tipo, int clave,String empleador, float sueldo, String RUPemp,float capital) {
        super(solicitante, DNI, tipo, clave,capital);
        this.empleador=empleador;
        this.sueldo=sueldo;
        this.RUPemp=RUPemp;
        this.mantenimiento=(float) 0.04;
    }
    @Override
    public String mostrar(){
        return super.mostrar()+"\n"+"SUELDO:"+sueldo+"\n"+"EMPLEADOR:"+empleador+"\n"+"RUP(Empleador):"+RUPemp+"\n";
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
