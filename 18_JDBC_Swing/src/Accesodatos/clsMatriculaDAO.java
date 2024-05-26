/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import entidades.clsDetalleMatricula;
import entidades.clsMatricula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsMatriculaDAO {
    
    public void agregar_PA(clsMatricula obj, ArrayList<clsDetalleMatricula> lista) throws Exception{
        Connection cn = null;
        CallableStatement cst = null;
        int idMatricula;
        clsDetalleMatriculaDAO objDAO = new clsDetalleMatriculaDAO();
        
        try {
            cn = clsConexion.getConexion();
            cst = cn.prepareCall("{call pa_agregarMatricula(?, ?, ?, ?)}");
            cst.setString(1, obj.getFecha());
            cst.setInt(2, obj.getTotalCreditos());
            cst.setString(3, obj.getCodigoAlumno());
            //PARAMETRO DE SALIDA
            cst.registerOutParameter("idMatricula", Types.INTEGER);
            cst.execute();
            //CAPTURAR u obtener el id Matricula autogenerado
            idMatricula = cst.getInt("idMatricula");
            //registro de los detalles de Matricula
            for (clsDetalleMatricula objD : lista) {
                objD.setIdMatricula(idMatricula);
                objDAO.agregar(objD, cn);
            }
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //INSERT INTO
    public void agregar(clsMatricula obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into matricula values(null, '"+obj.getFecha()+"', "
                    +obj.getTotalCreditos()+", '"+obj.getCodigoAlumno()+"');";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsMatricula obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update matricula " 
                    +"set fecha = '"+obj.getFecha()+"'," 
                    +"	totalCreditosMat = "+obj.getTotalCreditos()+"," 
                    +"	Alumno_codigo = '"+obj.getCodigoAlumno()+"' " 
                    +"where idMatricula = "+obj.getIdMatricula()+"";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsMatricula> listado() throws Exception{
        ArrayList<clsMatricula> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsMatricula obj = new clsMatricula(rs.getInt("idMatricula"), rs.getString("fecha"), 
                        rs.getInt("totalCreditosMat"), rs.getString("Alumno_codigo"));
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
