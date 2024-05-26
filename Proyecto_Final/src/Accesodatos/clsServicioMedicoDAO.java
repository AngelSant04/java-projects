/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsServicioMedico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsServicioMedicoDAO {
    
    public void modificarCupos(int idAux, int cupos, Connection cn) throws Exception{
        //Connection cn = null;
        Statement st = null;
        String sentenciaSQL = " Update serviciomedico " 
                +" set numCupos = "+(cupos-1)+" " 
                +" where idServicioMedico = "+idAux+";";
        try {
            //cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            //cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //INSERT INTO
    public void agregar(clsServicioMedico obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {            
            sentenciaSQL = "insert into serviciomedico values(null, "+obj.getNumeroCupos()+",'"+obj.getEspecialidad()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }        
    
    //UPDATE
    public void modificar(clsServicioMedico obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = " Update serviciomedico " 
                +"set numCupos = "+obj.getNumeroCupos()+"," 
                +"especialidad = '"+obj.getEspecialidad()+"' " 
                +"where idServicioMedico = '"+obj.getIdServicioMedico()+"'";
        try {
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsServicioMedico> listado() throws Exception{
        ArrayList<clsServicioMedico> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from serviciomedico";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsServicioMedico obj = new clsServicioMedico(rs.getInt("idServicioMedico"), rs.getInt("numCupos"), 
                        rs.getString("especialidad"));
                lista.add(obj);
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
}
