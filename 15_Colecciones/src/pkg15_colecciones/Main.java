/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_colecciones;

import clases.clsPersona;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //COLECCIONES: Son estructuras de datos como objetos
        //ArrayList (Vector Dinamico)        
        coleccionGenericaObjetos();
        //coleccionNoGenerica();
        //coleccionGenericas();                
    }
    
    static void coleccionGenericaObjetos(){
        List<clsPersona> lista = new ArrayList<>();
        clsPersona objP = new clsPersona("123", "Juan Perez", 29);
        
        lista.add(objP);
        lista.add(new clsPersona("456", "Ana Lopez", 26));
        
        for (clsPersona persona : lista) {
            System.out.println(persona.toString());
        }
    }
    
    static void coleccionGenericas(){
        //interface
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Juan");
        listaCadenas.add("Ana");
        listaCadenas.add("Rosa");
        
        for (String Cadena : listaCadenas) {
            System.out.println(Cadena);
        }
    }
    
    static void coleccionNoGenerica(){
        ArrayList lista = new ArrayList();
        clsPersona objP = new clsPersona("123", "Juan Perez", 29);
        
        lista.add(20);
        lista.add("Juan");
        lista.add(objP);
        
        //Recorrer las colecciones
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: "+lista.get(i).toString());            
        }
        
        System.out.println("---------------------------------");
        for(Object obj:lista){
            if(obj instanceof clsPersona)
                System.out.println("Elemento: "+ obj.toString());
        }                
    }
    
}
