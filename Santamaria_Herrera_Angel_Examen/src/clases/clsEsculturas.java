/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsEsculturas extends clsArte {
    private int cultura;
    private int material;

    public clsEsculturas() {
        this.tipo =2;
    }

    public clsEsculturas(int cultura, int material, String codigo, String descripcion, String lugardeprocedencia, double precio, int antiguedad) {
        super(codigo, descripcion, lugardeprocedencia, precio, antiguedad);
        this.cultura = cultura;
        this.material = material;
        this.tipo =2;
    }

    public int getCultura() {
        return cultura;
    }

    public int getMaterial() {
        return material;
    }      
    
    @Override
    public String mostrar(){
        return super.mostrar()+" - "+clsConstantes.CULTURA_ESCULTURA[(this.cultura-1)]+" - "+clsConstantes.MATERIAL_ESCULTURA[(this.material-1)];
    }

    @Override
    public void calcularDescuento() {
        if(this.material == 2){
            this.precio = (7/10)*this.precio;
        }
    }
        
}
