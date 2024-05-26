/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Accesodatos.clsMatriculaDAO;
import entidades.clsDetalleMatricula;
import entidades.clsMatricula;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class pruebaMatricula {
    public static void main(String[] args) {
        clsMatricula objM;
        clsMatriculaDAO objDAO = new clsMatriculaDAO();
        ArrayList<clsDetalleMatricula> lista = new ArrayList<>();
        
        try {
            objM = new clsMatricula(0, "19-11-20", 21, "A005");
            lista.add(new clsDetalleMatricula(0,15,1,2));
            lista.add(new clsDetalleMatricula(0,20,1,1));
            lista.add(new clsDetalleMatricula(0,20,1,2));
            objDAO.agregar_PA(objM, lista);
            System.out.println("MATRICULA y DETALLE AGREGADOS");
        } catch (Exception e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
}
