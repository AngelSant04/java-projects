/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_appalumnos_poo;

import clases.clsAlumno;
import clases.clsListaAlumnos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {          
        int op;
        /*clsAlumno obj1 = new clsAlumno("A001", "PEDRO", "FISICA", 18, 1, "2021");
        clsAlumno obj2 = new clsAlumno("A002", "ANA", "EPICI", 21, 1, "2021");
        clsAlumno obj3 = new clsAlumno("A003", "CESAR", "FISICA", 20, 1, "2021");*/
        
        clsListaAlumnos lista = new clsListaAlumnos();
                
        do{
            op = opciones();
            switch(op){
                case 1: agregarAlumno(lista);
                    break;
                case 2: lista.presentar();
                    break;
                case 3: buscarxCodigo(lista);
                    break;
                case 4: cambiarCarrera(lista);
                    break;
                case 5:System.out.println("*** Fin de Sistema ***");
                    break;
            }
        }while(op != 5);        
                
        /*lista.insertar(obj1);
        lista.insertar(obj2);
        lista.insertar(obj3);
        
        lista.presentar();*/
    }
    
    static void agregarAlumno(clsListaAlumnos lista){
        clsAlumno objeto;
        objeto = new clsAlumno();
        
        objeto.llenar();
        
        lista.insertar(objeto);        
    }  
    
    static void buscarxCodigo(clsListaAlumnos lista){
        int band = 0;
        String codAux;
        System.out.println("Ingrese codigo a buscar: ");
        Scanner lector = new Scanner(System.in);
        codAux = lector.next();
        for (int i = 0; i < lista.getContador(); i++) {
            if((lista.getDatos()[i].getCodigo()).equals(codAux)){
                lista.getDatos()[i].mostrar();
                band = 1;
            }
        }
        if(band == 0) System.out.println("Codigo no encontrado");
    }
    
    static void cambiarCarrera(clsListaAlumnos lista){
        int op,band = 0;
        String codAux,carreraAux;
        System.out.println("Ingrese codigo de alumno para cambiar carrera:");
        Scanner lector = new Scanner(System.in);
        codAux = lector.next();
        for (int i = 0; i < lista.getContador(); i++) {
            if((lista.getDatos()[i].getCodigo()).equals(codAux)){
                System.out.println("Ingrese nueva Carrera");
                carreraAux = lector.next();
                lista.getDatos()[i].setCarrera(carreraAux);
                System.out.println("** CARRERA CAMBIADA **");
                System.out.println("Desea mostrar alumno");
                System.out.println("1-SI");
                System.out.println("2-NO");
                op = lector.nextInt();
                do{
                    if(op == 1 || op == 2){
                        if(op == 1) lista.getDatos()[i].mostrar();  
                    }else System.out.println("Opcion no valida");                                                  
                }while(op < 0 || op > 2); 
                band = 1;
            }            
        }
        if(band == 0) System.out.println("Codigo no encontrado");
    }        
    
    static int opciones(){
        int op;
        do{
            System.out.println("1-Agregar alumno");
            System.out.println("2-Presentar todos los alumnos");
            System.out.println("3-Buscar un alumno por su codigo");
            System.out.println("4-Cambiar de carrera a un alumno");
            System.out.println("5-SALIR");
            System.out.println("ELEGIR OPCION: ");
            Scanner lector = new Scanner(System.in);
            op = lector.nextInt();
            if(op < 1 || op > 5) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op >5);
        return op;
    }
    
}

    /*TRABAJO
        A. Crear un menu de opciones, qe es controlado por el MAIN
        1.Agregar alumno
        2.Presentar todos los alumnos
        3.Buscar un alumno por su codigo
        4.Cambiar de carrera a un alumno
        5.SALIR
        B. Se puede crear nuevos metodos en las clases
        */
