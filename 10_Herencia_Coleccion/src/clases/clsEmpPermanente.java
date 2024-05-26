/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsEmpPermanente extends clsEmpleado{
    private double sueldoBase;
    private String cargo;

    public clsEmpPermanente() {
    }      

    public clsEmpPermanente(double sueldoBase, String cargo, String dni, 
                                String nombres, int edad) {        
        super(dni, nombres, edad);
        this.sueldoBase = sueldoBase;
        this.cargo = cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getCargo() {
        return cargo;
    }
    
    //Metodo SOBRE ESCRITO
    @Override
    public String mostrar(){
        return super.mostrar()+"-"+cargo+"-"+sueldoBase;
    }
}
