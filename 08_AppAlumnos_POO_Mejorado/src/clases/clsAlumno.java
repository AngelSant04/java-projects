/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsAlumno {
   //Atributos - caracteristicas
    private String codigo;
    private String nombre;
    private String carrera;
    private String semestredeingreso;
    private int edad;
    private int sexo;
    private clsListaEvaluacion evaluacion;

    public clsAlumno(){   //codigo=null 
        this.evaluacion = new clsListaEvaluacion();
    }
    
    public clsAlumno(String codigo, String nombre,String carrera,
                    int edad, int sexo, String semestredeingreso){
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestredeingreso = semestredeingreso;
        this.edad =  edad;
        this.sexo = sexo;
        this.evaluacion = new clsListaEvaluacion();
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
    
    public String mostrar(){
        return nombre+"-"+codigo+"-"+carrera+"\n"+evaluacion.presentar();
    }

    /*public clsListaEvaluacion getEvaluacion() {
        return evaluacion;
    }*/
    
    /*public String presentar(int pos){
        return evaluacion
    }*/
    
    public void agregarEvaluacion(clsEvaluacion E){
        this.evaluacion.insertar(E);
    }
    
        
}
