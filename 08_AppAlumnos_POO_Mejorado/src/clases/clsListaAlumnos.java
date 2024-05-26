/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaAlumnos {
    
    private final int MAX = 1;
    //Atributos
    private int contador;
    private clsAlumno datos[];
    
    //Metodos
    
    public clsListaAlumnos(){
        this.contador = 0;
        datos = new clsAlumno[MAX];
    }
    
    public void insertar(clsAlumno obj){
        datos[contador] = obj;
        contador++;
    }  
    
    public String presentar(){
        String contenido = "";
        for (int i = 0; i < this.contador; i++) {
            contenido = contenido+datos[i].mostrar()+"\n";
        }
        return contenido;
    }
    
    public void modificarCarrera(int pos,String carreraAux){
        this.datos[pos].setCarrera(carreraAux);
    }

    public int getContador() {
        return contador;
    }       

    public clsAlumno[] getDatos() {
        return datos;
    }    
    
}
