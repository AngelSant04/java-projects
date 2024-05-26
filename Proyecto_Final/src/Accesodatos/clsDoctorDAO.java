/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;


import Entidades.clsDoctor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsDoctorDAO {
    
    //INSERT INTO
    public void agregar(clsDoctor obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {            
            sentenciaSQL = "insert into doctor values('"+obj.getIdDoctor()+"', '"+obj.getNombres()+"', '"
                    +obj.getApPaterno()+"', '"+obj.getApMaterno()+"','"+obj.getEspecialidad()+"');";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsDoctor obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "Update doctor " 
                +"set nombres = '"+obj.getNombres()+"'," 
                +"apPaterno = '"+obj.getApPaterno()+"'," 
                +"apMaterno = '"+obj.getApMaterno()+"'," 
                +"especialidad = '"+obj.getEspecialidad()+"' " 
                +"where idDoctor = '"+obj.getIdDoctor()+"'";
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
    public ArrayList<clsDoctor> listado() throws Exception{
        ArrayList<clsDoctor> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from doctor";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsDoctor obj = new clsDoctor(rs.getString("idDoctor"), rs.getString("nombres"), 
                        rs.getString("apPaterno"), rs.getString("apMaterno"), rs.getString("especialidad"));
                lista.add(obj);
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
    public clsDoctor buscar(String IdAux) throws Exception{
        clsDoctor doctor = null;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from doctor where idDoctor = '"+IdAux+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsDoctor obj = new clsDoctor(rs.getString("idDoctor"), rs.getString("nombres"), 
                        rs.getString("apPaterno"), rs.getString("apMaterno"), rs.getString("especialidad"));        
                doctor = obj;
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return doctor;
    }
    
}
