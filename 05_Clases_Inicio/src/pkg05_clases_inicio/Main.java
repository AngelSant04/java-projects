/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_clases_inicio;

import clases.clsAlumno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        clsAlumno obj, obj2,obj3,obj4,obj5 = null;               //Declaracion
        
        obj = new clsAlumno();             //Instanciar un objeto
        obj2 = new clsAlumno();
        obj3 = new clsAlumno("A003", "Ana", "EPICI", "2020");
        obj4 = new clsAlumno("A004", "Pedro", "Fisica", 18, 1, "2021");
        obj5 = new clsAlumno();
        
        obj5.llenar();        
        
        //obj.setCodigo("A0001");
        System.out.println("Nuevo Codigo: "+ obj.getCodigo());
        
        //obj2.setCodigo(obj.getCodigo());
        System.out.println("Codigo del objeto 2: "+ obj2.getCodigo());
        System.out.println("Codigo del objeto 3: "+ obj3.getCodigo());
        System.out.println("Codigo del objeto 4: "+ obj4.getCodigo());
        System.out.println("Codigo del objeto 5: "+ obj5.getCodigo());
        
        obj.mostrar();
        obj2.mostrar();
        llenarObjeto();
        mayorEdad(obj, obj2, obj3, obj4, obj5);
        
        /*if (obj2.getCodigo().equals(obj2.getCodigo())) {
            System.out.println("ERROR: codigos repetidos");
        }*/
    }
    
    static void llenarObjeto(){
        clsAlumno obj6;
        Scanner lector = new Scanner(System.in);
        String codigo, nombre, carrera;
        System.out.println("Ingrese codigo: ");
        codigo = lector.next();
        System.out.println("Ingrese nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese carrera: ");
        carrera = lector.next();
        //validaciones de ingreso de datos
        if(validarDatos(codigo, carrera)){
            obj6 = new clsAlumno(codigo, nombre, carrera, "");
            System.out.println("Codigo de obj6 "+obj6.getCodigo());
        }else System.out.println("Codigo no permitido");
    }
    
    static boolean validarDatos(String codigo, String carrera){
        if(!codigo.equals("0000") && (carrera.equals("EPICI"))) return true;
        return false;
    }
    
    static void mayorEdad(clsAlumno obj1, clsAlumno obj2,
            clsAlumno obj3,clsAlumno obj4, clsAlumno obj5){
        int mayor = obj1.getEdad();
        
        if (obj2.getEdad() > mayor) mayor = obj2.getEdad();
        if (obj3.getEdad() > mayor) mayor = obj3.getEdad();
        if (obj4.getEdad() > mayor) mayor = obj4.getEdad();
        if (obj5.getEdad() > mayor) mayor = obj5.getEdad();
        System.out.println("La edad mayor es: "+mayor);
    }
    
}
