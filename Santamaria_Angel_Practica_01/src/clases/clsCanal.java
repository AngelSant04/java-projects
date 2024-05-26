/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsCanal {
    
    private String nombre;
    private String nacionalidad;
    private int calidad;
    private clsListaContenido contenido;

    public clsCanal() {
        this.contenido = new clsListaContenido();
    }

    public clsCanal(String nombre, String nacionalidad, int calidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.calidad = calidad;
        this.contenido = new clsListaContenido();
    }

    /*public clsListaContenido getContenido() {
        return contenido;
    }*/            //No existe encapsulamiento no se puede usar.(por buenas practicas)

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getCalidad() {
        return calidad;
    }
    
    public void agregarcontenido(clsContenido C){
        this.contenido.insertar(C);
    }

    public clsListaContenido getContenido() {
        return contenido;
    }        
    
    public String mostrar(){
        return this.nombre+" - "+this.nacionalidad+" - "+(clsConstantes.CALIDAD[this.calidad-1])+"\n"+contenido.presentar()+"\n";
    }
    
    public String mostrarContenido(){
        return this.contenido.presentar();
    }
    
    public int buscarcontenido(String tituloAux){
        for (int i = 0; i < this.contenido.getContador(); i++) {
            if(this.contenido.getDatos()[i].getTitulo().equals(tituloAux)){
                return i;
            }
        }
        return -1;
    }
    
    public void cambiarcategoria(int categoria, int pos){
       contenido.getDatos()[pos].setCategoria(categoria);
    }
    
    public int returnCategoria(int pos){
        return contenido.getDatos()[pos].getCategoria();
    }
    
}
