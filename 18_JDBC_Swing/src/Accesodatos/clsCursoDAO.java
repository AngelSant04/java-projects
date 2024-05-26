/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import entidades.clsCurso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsCursoDAO {
    
    //INSERT INTO
    public void agregar_PA(clsCurso obj) throws Exception{
        Connection cn = null;
        CallableStatement cst = null;        //CUANDO TRABAJO CON PROCEDIMIENTOS
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "{call pa_agregarCurso(?, ?, ?)}";
            cn = clsConexion.getConexion();
            cst = cn.prepareCall(sentenciaSQL);
            //ENVIAR PARAMETROS
            
            cst.setString(1, obj.getNombre());
            cst.setInt(2, obj.getCreditos());
            cst.setString(3, obj.getCiclo());
            
            cst.execute();
            
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
   
    //INSERT INTO
    public void agregar(clsCurso obj) throws Exception{
        Connection cn = null;
        Statement st = null;            //CUADNO TRABAJAS CON SENTENCIAS
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into curso values(null, '"+obj.getNombre()+"',"
                    +obj.getCreditos()+", '"+obj.getCiclo()+"');";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsCurso obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "Update curso " 
                +"set nombre = '"+obj.getNombre()+"'," 
                +"creditos = "+obj.getCreditos()+"," 
                +"Ciclo = '"+obj.getCiclo()+"' " 
                +"where idCurso = "+obj.getIdCurso()+";";
        try {
            sentenciaSQL = "";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsCurso> listado() throws Exception{
        ArrayList<clsCurso> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from curso";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsCurso obj = new clsCurso(rs.getInt("idCurso"), 
                        rs.getString("nombre"), rs.getInt("creditos"), rs.getString("Ciclo"));
                lista.add(obj);
            }
            //st.executeUpdate(sentenciaSQL);
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
}
