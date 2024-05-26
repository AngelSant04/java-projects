/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

public class clsAlumno {
    //Atributos - Caracteristicas
    private String codigo;
    private String nombre;
    private String carrera;
    private String semestreIngreso;
    private int edad;
    private int sexo;
    
    //METODOS(operaciones que "utilizan" a los atributos)
    //Funciones de trabajo para el exterior
    
    //1. Metodos de acceso(get(devolver) - set(establecer o modificar))
    /*public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String nuevoCodigo) {
        codigo = nuevoCodigo;
    }*/

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public int getSexo() {
        return sexo;
    }
    
    //2. Constructores(Permite enviar valores iniciales al instanciar un objeto)
    public clsAlumno(){
        
    }
    public clsAlumno(String cod, String nom, String carr, int ed, int sex, String sem){
        codigo = cod;
        this.nombre = nom;
        carrera = carr;
        edad = ed;
        this.sexo = sex;
        this.semestreIngreso = sem;
    }
    
    public clsAlumno(String nom, String carr, int ed, int sex, String sem){
        this.nombre = nom;
        carrera = carr;
        edad = ed;
        this.sexo = sex;
        this.semestreIngreso = sem;
    }
    
    public clsAlumno(String cod, String nomb, String carr, String sem){
        this.codigo = cod;
        this.nombre = nomb;
        carrera = carr;        
        this.semestreIngreso = sem;
    }
            
    //3. Metodos de proceso
    public void mostrar(){
        System.out.println("Bienvenido alumno con codigo: "+this.codigo);
    }
    
    public void llenar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese codigo: ");
        this.codigo = lector.next();
        System.out.println("Ingrese carrera: ");
        this.carrera = lector.next();
    }
}
