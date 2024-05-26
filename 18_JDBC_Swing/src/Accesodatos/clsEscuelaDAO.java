/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import entidades.clsEscuela;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsEscuelaDAO {
    //METODOS para enviar sentencias a la base de datos
    //SENTENCIAS: Insert Into, Update, Select, Delete
    
    //INSERT INTO
    public void agregar(clsEscuela obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into escuela values(null,'"+obj.getDescripcion()+"','"
                    +obj.getDirector()+"','"+obj.getYear()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsEscuela obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update escuela " 
                    +"set nombreDirector = '"+obj.getDirector()+"'," 
                    +"descripcion = '"+obj.getDescripcion()+"'," 
                    +"yearcreacion = '"+obj.getYear()+"' " 
                    +"where idEscuela = "+ obj.getIdEscuela();
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsEscuela> listado() throws Exception{
        ArrayList<clsEscuela> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from escuela";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsEscuela obj = new clsEscuela(rs.getInt(1), rs.getString("descripcion"), rs.getString(3),
                                rs.getString("yearCreacion"));
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
