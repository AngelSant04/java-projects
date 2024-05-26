/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsRecetaMedica;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsRecetaMedicaDAO {
    //INSERT INTO
    public void agregar(clsRecetaMedica obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {            
            sentenciaSQL = "insert into recetamedica values(null, '"+obj.getDescripcion()+"','"
                    +obj.getPresentacion()+"',"+obj.getIdCitaMedica()+");";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsRecetaMedica obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update recetamedica " 
                    +" set descripcion = '"+obj.getDescripcion()+"'," 
                    +"presentacion = '"+obj.getPresentacion()+"'," 
                    +"CitaMedica_idCitaMedica = "+obj.getIdCitaMedica()+" " 
                    +" where idReceta= '"+obj.getIdReceta()+"';";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsRecetaMedica> listado() throws Exception{
        ArrayList<clsRecetaMedica> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from recetamedica";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsRecetaMedica obj = new clsRecetaMedica(rs.getInt("idReceta"), rs.getString("descripcion"), 
                        rs.getString("presentacion"),rs.getInt("CitaMedica_idCitaMedica"));        
                lista.add(obj);
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    public ArrayList<clsRecetaMedica> listado_ID(int idCitaAux) throws Exception{
        ArrayList<clsRecetaMedica> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from recetamedica";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsRecetaMedica obj = new clsRecetaMedica(rs.getInt("idReceta"), rs.getString("descripcion"), 
                        rs.getString("presentacion"),rs.getInt("CitaMedica_idCitaMedica"));
                if(obj.getIdCitaMedica() == idCitaAux){
                    lista.add(obj);
                }                
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
}
