/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsListaAlumnos {
    
    private final int MAX = 10;
    //Atributos
    private int contador;
    private clsAlumno datos[];
    
    //Metodos
    //Constructor estatico es decir solo acepta 10 alumnos
    public clsListaAlumnos(){
        this.contador = 0;
        datos = new clsAlumno[MAX];
    }
    
    public void insertar(clsAlumno obj){
        datos[contador] = obj;
        contador++;
    }
    
    public void presentar(){
        for (int i = 0; i < contador; i++) {
            System.out.println("---ALUMNO "+i+"---");
            System.out.println("Codigo: "+datos[i].getCodigo());
            System.out.println("Nombre: "+datos[i].getNombre());
            System.out.println("Carrera: "+datos[i].getCarrera());
            System.out.println("Semestre de ingreso: "+datos[i].getSemestredeingreso());
            System.out.println("Edad: "+datos[i].getEdad());
            System.out.println("Sexo: "+datos[i].getSexo());
        }
    }

    public int getContador() {
        return contador;
    }       

    public clsAlumno[] getDatos() {
        return datos;
    }    
    
}
