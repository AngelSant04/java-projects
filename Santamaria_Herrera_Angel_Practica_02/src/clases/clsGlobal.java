/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

public class clsGlobal {
    
    public static List<clsConsultorio> coleccionConsultorio = new ArrayList<>();
    public static List<clsPaciente> coleccionPaciente = new ArrayList<>();
    public static List<clsCitas> coleccionCita = new ArrayList<>();
    
    public static void cargarConsultorio(){
        coleccionConsultorio.add(new clsConsultorio("Medicina General", "dct. Pedro", 1));      
        coleccionConsultorio.add(new clsConsultorio("Neurologo", "dct. Angel", 15)); 
        coleccionConsultorio.add(new clsConsultorio("Pedriatria", "dct. Yessenia", 5)); 
        coleccionConsultorio.add(new clsConsultorio("Psicologo", "dct. Alvaro", 10)); 
    }
    
    public static boolean existeDNIRegistrado(String dniAux){
        for (clsPaciente obj : coleccionPaciente) {
            if(obj.getDNI().equals(dniAux)){
                return true;
            }            
        }
        return false;
    }
    
}
