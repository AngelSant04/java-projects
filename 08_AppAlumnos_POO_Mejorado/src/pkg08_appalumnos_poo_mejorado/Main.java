/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_appalumnos_poo_mejorado;

import clases.clsAlumno;
import clases.clsConstantes;
import clases.clsEvaluacion;
import clases.clsListaAlumnos;
import clases.clsListaEvaluacion;
import java.util.Scanner;

public class Main {       
    
    static void llenarObjeto(clsListaAlumnos lista){
        clsAlumno obj;
        Scanner lector = new Scanner(System.in);
        String codigo, nombre, carrera,semestre;
        int edad,sexo;
        System.out.println("Ingrese codigo: ");
        codigo = lector.next();
        System.out.println("Ingrese nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese carrera: ");
        carrera = lector.next();
        System.out.println("Ingrese semestre de ingreso: ");
        semestre = lector.next();
        System.out.println("Ingrese edad: ");
        edad = lector.nextInt();
        System.out.println("Ingrese sexo: ");
        sexo = lector.nextInt();
        
        obj = new clsAlumno(codigo,nombre,carrera,edad,sexo,semestre);
        
        lista.insertar(obj);
    }
    
    /*static clsAlumno llenarNuevoObjeto(clsListaAlumnos lista){
        clsAlumno obj;
        Scanner lector = new Scanner(System.in);
        String codigo, nombre, carrera,semestre;
        int edad,sexo;
        System.out.println("Ingrese codigo: ");
        codigo = lector.next();
        System.out.println("Ingrese nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese carrera: ");
        carrera = lector.next();
        System.out.println("Ingrese semestre de ingreso: ");
        semestre = lector.next();
        System.out.println("Ingrese edad: ");
        edad = lector.nextInt();
        System.out.println("Ingrese sexo: ");
        sexo = lector.nextInt();
        
        obj = new clsAlumno(codigo,nombre,carrera,edad,sexo,semestre);
        return obj;
    }*/
    
    static void presentarObjetos(clsListaAlumnos lista){
        for (int i = 0; i < lista.getContador(); i++) {
            System.out.println("---ALUMNO "+i+"---");
            System.out.println("Codigo: "+lista.getDatos()[i].getCodigo());
            System.out.println("Nombre: "+lista.getDatos()[i].getNombre());
            System.out.println("Carrera: "+lista.getDatos()[i].getCarrera());
            System.out.println("Semestre de ingreso: "+lista.getDatos()[i].getSemestredeingreso());
            System.out.println("Edad: "+lista.getDatos()[i].getEdad());
            System.out.println("Sexo: "+lista.getDatos()[i].getSexo());
        }
    }
    
    static void presentarObjeto(clsListaAlumnos lista, int j){
        for (int i = 0; i < lista.getContador(); i++) {
            if(i == j){
                System.out.println("---ALUMNO "+i+1+"---");
                System.out.println("Codigo: "+lista.getDatos()[i].getCodigo());
                System.out.println("Nombre: "+lista.getDatos()[i].getNombre());
                System.out.println("Carrera: "+lista.getDatos()[i].getCarrera());
                System.out.println("Semestre de ingreso: "+lista.getDatos()[i].getSemestredeingreso());
                System.out.println("Edad: "+lista.getDatos()[i].getEdad());
                System.out.println("Sexo: "+lista.getDatos()[i].getSexo());
            }
        }
    }
    
    static void llenarEvaluacion(clsAlumno lista){
        clsEvaluacion obj;
        Scanner lector = new Scanner(System.in);
        String descripcion;
        int tipo;
        float nota;
        System.out.println("Ingrese descripcion: ");
        descripcion = lector.nextLine();
        do{
            System.out.println("Ingrese tipo: 1-Practica Calificada 2-Examen Oral 3-Examen de unidad 4-Examen FInal");
            tipo = lector.nextInt();
        }while(tipo < 0 || tipo > 5 );
        System.out.println("Ingrese nota: ");
        nota = lector.nextInt();
        
        obj = new clsEvaluacion(descripcion, tipo, nota);
        
        lista.agregarEvaluacion(obj);
    }
    
    static void presentarEval(clsListaEvaluacion lista){
        for (int i = 0; i < lista.getContador(); i++) {
            System.out.println("---EVALUACION "+(i+1)+"---");
            System.out.println("Descripcion: "+lista.getDatos()[i].getDescripcion());
            System.out.println("Tipo: "+clsConstantes.TIPO[lista.getDatos()[i].getTipo()-1]);
            System.out.println("Nota: "+lista.getDatos()[i].getNota());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        clsListaAlumnos lista = new clsListaAlumnos(); 
        do{
            op = opciones();
            switch(op){
                case 1: llenarObjeto(lista);
                break;
                case 2: presentarObjetos(lista);
                break;
                case 3: buscarxCodigo(lista);
                break;
                case 4: cambiarCarrera(lista);
                break;
                case 5: registrarEvaluacion(lista);
                break;
                case 6: presentarEvaluacion(lista);
                break;
                case 7: System.out.println("** FIN DE SISTEMA **");
                break;
            }
        }while(op != 7);
        //clsAlumno obj;
        //llenarObjeto(lista);
        
        //obj = llenarNuevoObjeto(lista);
        //lista.insertar(obj);
        
        //lista.presentar();
    }  
    
    public static int opciones(){
        int op;
        do{
            System.out.println("1-Agregar alumno");
            System.out.println("2-Presentar todos los alumnos");
            System.out.println("3-Buscar un alumno por su codigo");
            System.out.println("4-Cambiar de carrera a un alumno");
            System.out.println("5-Ingresar Examenes de un alumno");
            System.out.println("6-Mostrar examenes de un alumno");
            System.out.println("7-SALIR");
            System.out.println("ELEGIR OPCION: ");
            Scanner lector = new Scanner(System.in);
            op = lector.nextInt();
            if(op < 1 || op > 7) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op > 7);
        return op;
    }
    
    static int buscaralumno(String cod, clsListaAlumnos lista){
        for (int i = 0; i < lista.getContador(); i++) {
            if((lista.getDatos()[i].getCodigo()).equals(cod)){
                return i;                
            }
        }        
        return -1;
    }
    
    static void buscarxCodigo(clsListaAlumnos lista){
        int band;
        String codAux;
        System.out.println("Ingrese codigo a buscar: ");
        Scanner lector = new Scanner(System.in);
        codAux = lector.next();
        band = buscaralumno(codAux, lista);
        if(band != -1) presentarObjeto(lista, band);
        else System.out.println("Codigo no encontrado");
    }
    
    static void cambiarCarrera(clsListaAlumnos lista){
        int op,band;
        String codAux,carreraAux;
        System.out.println("Ingrese codigo de alumno para cambiar carrera:");
        Scanner lector = new Scanner(System.in);
        codAux = lector.next();
        band = buscaralumno(codAux, lista);
        if(band != -1){
            System.out.println("Ingrese nueva carrera");
            carreraAux = lector.next();
            lista.modificarCarrera(band, carreraAux);
            System.out.println("** CARRERA CAMBIADA **");
            System.out.println("Desea mostrar alumno");
            System.out.println("1-SI");
            System.out.println("2-NO");
            op = lector.nextInt();
            do{
                if(op == 1 || op == 2){
                    if(op == 1) presentarObjeto(lista,band);
                 }else System.out.println("Opcion no valida");                                                  
            }while(op < 0 || op > 2);                  
        }else System.out.println("Codigo no encontrado");
    }
    
    static void registrarEvaluacion(clsListaAlumnos lista){ 
        int op, band;
        String codAux;  
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese codigo de alumno donde desea ingresar evaluaciones");
        codAux = lector.next();
        band = buscaralumno(codAux, lista);
        if (band != -1) {
            do{
                System.out.println("** Creamos evaluacion ** ");
                llenarEvaluacion(lista.getDatos()[band]);
                do{
                    System.out.println("Desea ingresar otra: 1- SI 2- NO");
                    op = lector.nextInt();
                    if(op == 1 || op == 2){
                        if(op == 2) System.out.println("** Proceso Finalizado **");
                    }else System.out.println("Opcion no valida");                                                  
                }while(op < 0 || op > 2);                                     
            }while(op != 2);
        }else System.out.println("Codigo no encontrado");
    }
    
    static void presentarEvaluacion(clsListaAlumnos lista){
        String codAux;
        int band;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese codigo de alumno para mostrar sus evaluaciones");
        codAux = lector.next();
        band = buscaralumno(codAux, lista);
        if (band != -1) {
            System.out.println(lista.getDatos()[band].mostrar());
        }
        else System.out.println("Codigo no enconttrado");
    }    
}
