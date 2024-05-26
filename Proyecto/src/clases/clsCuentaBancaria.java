/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsCuentaBancaria {
    
    private String DNI;
    private String numeroCuenta;
    private String clave;
    private double monto;

    public clsCuentaBancaria() {
    }

    public clsCuentaBancaria(String DNI, String numeroCuenta, String clave, double monto) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.monto = monto;
    } 

    public String getDNI() {
        return DNI;
    }        

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getClave() {
        return clave;
    }

    public double getMonto() {
        return monto;
    }    

    @Override
    public String toString() {
        return this.numeroCuenta+" - "+this.DNI+" - "+this.monto;
    }

    
}
