/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

public class clsAlumno {
   //Atributos - caracteristicas
    
    private String codigo;
    private String nombre;
    private String carrera;
    private String semestredeingreso;
    private int edad;
    private int sexo;
    
    public clsAlumno(){   //codigo=null     
    }
    
    public clsAlumno(String codigo, String nombre,String carrera,
                    int edad, int sexo, String semestredeingreso){
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestredeingreso = semestredeingreso;
        this.edad =  edad;
        this.sexo = sexo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }        

    public String getSemestredeingreso() {
        return semestredeingreso;
    }

    public int getEdad() {
        return edad;
    }

    public int getSexo() {
        return sexo;
    }    

    public void llenar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese codigo: ");
        this.codigo = lector.next();
        System.out.println("Ingrese nombre: ");
        this.nombre = lector.next();
        System.out.println("Ingrese carrera: ");
        this.carrera = lector.next();
        System.out.println("Ingrese semestre de ingreso: ");
        this.semestredeingreso = lector.next();
        System.out.println("Ingrese edad: ");
        this.edad = lector.nextInt();
        System.out.println("Ingrese sexo: ");
        this.sexo = lector.nextInt();
    }
    
    public void mostrar(){
            System.out.println("---ALUMNO---");
            System.out.println("Codigo: "+this.codigo);
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Carrera: "+this.carrera);
            System.out.println("Semestre de ingreso: "+this.semestredeingreso);
            System.out.println("Edad: "+this.edad);
            System.out.println("Sexo: "+this.sexo);
    }
    
}
