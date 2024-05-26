/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

public class clsGlobal {
    
    
    public static List<clsPersona> coleccionPersona = new ArrayList<>();    
    public static List<String> coleccionDNI = new ArrayList<>(); 
    public static List<clsCuentaBancaria> coleccionCuenta = new ArrayList<>();
    
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
        for (clsPersona obj : coleccionPersona) {
            if(obj.getDni().equals(dniAux)){
                return true;
            }            
        }
        return false;
    }
    
    public static int buscarPosicionPersona(String dni){
        for (int i = 0; i < coleccionPersona.size(); i++) {
            if(dni.equals(coleccionPersona.get(i).getDni())){
                return i;
            }
        }
        return -1;
    }
}
