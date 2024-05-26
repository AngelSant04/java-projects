/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import entidades.clsDetalleMatricula;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsDetalleMatriculaDAO {
    //INSERT INTO
    public void agregar(clsDetalleMatricula obj, Connection cn) throws Exception{
        //Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into detallematricula values(null, "+obj.getNota()+","
                    +obj.getIdMatricula()+", "+obj.getIdCurso()+")";
            //cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            //cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsDetalleMatricula obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update detallematricula " 
                    +"set nota = "+obj.getNota()+"," 
                    +"Matricula_idMatricula = "+obj.getIdMatricula()+"," 
                    +"Curso_idCurso = "+obj.getIdCurso()+" " 
                    +"where iddetalle = "+obj.getIdDetalle()+"";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsDetalleMatricula> listado() throws Exception{
        ArrayList<clsDetalleMatricula> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from detallematricula";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsDetalleMatricula obj = new clsDetalleMatricula(rs.getInt("iddetalle"), 
                        rs.getInt("nota"), rs.getInt("Matricula_idMatricula"), rs.getInt("Curso_idCurso"));
            }
            //st.executeUpdate(sentenciaSQL);
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
}
