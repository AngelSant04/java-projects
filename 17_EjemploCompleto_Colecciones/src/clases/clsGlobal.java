/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

public class clsGlobal {
    //COLECCION DE PERSONAS
    
    public static List<clsPersona> lista = new ArrayList<>();
    public static List<clsTrabajo> coleccion = new ArrayList<>();
    public static List<String> coleccionDNI = new ArrayList<>();
    
    public static void cargarDNI(){
        coleccionDNI.add("123");
        coleccionDNI.add("456");
        coleccionDNI.add("789");
        coleccionDNI.add("111");
        coleccionDNI.add("222");
        coleccionDNI.add("333");
        coleccionDNI.add("444");        
    }
    
    public static boolean existeDNI(String dniAux){
        for (String dni : coleccionDNI) {
            if(dni.equals(dniAux)){
                return true;
            }            
        }
        return false;
    }
    
    public static boolean existeDNIRegistrado(String dniAux){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getDni().equals(dniAux)){
                return true;
            }       
        }
        return false;
    }
    
    //Metodos sobre la lista: buscar una persona
    //Recorrer la coleccion y buscar DNI
    boolean buscarPersona(String dni){        
        return false;
    }
    
    //Recorrer la coleccion y devolver el Objeto    
    clsPersona buscar(String dni){
        clsPersona obj = null;
        return obj;
    }
    
    //Recorrer la coleccion y devolver posicion  
    public static int buscarPosicion(String dni){
        for (int i = 0; i < lista.size(); i++) {
            if(dni.equals(lista.get(i).getDni())){
                return i;
            }
        }
        return -1;
    }
    
    public static int buscarPosicionTrabajo(String idAux){
        for (int i = 0; i < coleccion.size(); i++) {
            if(idAux.equals(coleccion.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
}
