/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsPinturas extends clsArte {
    private String nombrepintor;
    private int estado;

    public clsPinturas() {
        this.tipo =1;
    }

    public clsPinturas(String nombrepintor, int estado, String codigo, String descripcion, String lugardeprocedencia, double precio, int antiguedad) {
        super(codigo, descripcion, lugardeprocedencia, precio, antiguedad);
        this.nombrepintor = nombrepintor;
        this.estado = estado;
        this.tipo =1;
    }

    public String getNombrepintor() {
        return nombrepintor;
    }

    public int getEstado() {
        return estado;
    }    

    @Override
    public String mostrar(){
        return super.mostrar()+" - "+this.nombrepintor+" - "+clsConstantes.ESTADO_PINTURA[(this.estado-1)];
    }  

    @Override
    public void calcularDescuento() {
        if(this.estado == 3){
            this.precio = (4/5)*this.precio;
        }
    }
}
