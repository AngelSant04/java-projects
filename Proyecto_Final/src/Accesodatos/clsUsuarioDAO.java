/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsUsuarioDAO {
    //INSERT INTO
    public void agregar(clsUsuario obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {            
            sentenciaSQL = "insert into usuario values('"+obj.getIdUsuario()+"', '"+obj.getNombres()+"', '"
                    +obj.getApPaterno()+"', '"+obj.getApMaterno()+"','"+obj.getCargo()+"','"+obj.getPasword()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsUsuario obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = " Update usuario " 
                    +" set nombres = '"+obj.getNombres()+"'," 
                    +"apPaterno = '"+obj.getApPaterno()+"'," 
                    +"apMaterno = '"+obj.getApMaterno()+"'," 
                    +"cargo = '"+obj.getCargo()+"'," 
                    +"pasword = '"+obj.getPasword()+"' " 
                    +"where idUsuario = '"+obj.getIdUsuario()+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsUsuario> listado() throws Exception{
        ArrayList<clsUsuario> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from usuario";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsUsuario obj = new clsUsuario(rs.getString("idUsuario"), 
                        rs.getString("nombres"), rs.getString("apPaterno"),rs.getString("apMaterno"), 
                        rs.getString("cargo"), rs.getString("pasword"));        
                lista.add(obj);
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

}
