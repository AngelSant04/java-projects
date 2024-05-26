/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsAtencionMedica;
import Entidades.clsCitaMedica;
import Entidades.clsServicioMedico;
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
public class clsAtencionMedicaDAO {          
    
    public void agregar_PA(clsAtencionMedica obj, ArrayList<clsCitaMedica> lista, ArrayList<clsServicioMedico> listaServicios) throws Exception{
        Connection cn = null;
        CallableStatement cst = null;
        int idAtencionMedica;
        clsCitaMedicaDAO objDAO = new clsCitaMedicaDAO();
        
        try {            
            cn = clsConexion.getConexion();
            cst = cn.prepareCall("{call pa_AgregarAtencionMedica(?,?,?)}");
            cst.setString(1, obj.getEspecialidad());
            cst.setString(2, obj.getDNIPaciente());
            //PARAMETRO DE SALIDA
            cst.registerOutParameter("idAtencionMedica", Types.INTEGER);
            cst.execute();
            //CAPTURAR u obtener el id de Atencion autogenerado
            idAtencionMedica = cst.getInt("idAtencionMedica");
            for (clsCitaMedica objD : lista) {
                objD.setIdAtencionMedica(idAtencionMedica);
                objDAO.agregar(objD, cn, listaServicios);
            }
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //INSERT INTO
    public void agregar(clsAtencionMedica obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into atencionmedica values(null, '"+obj.getEspecialidad()+"','"+obj.getDNIPaciente()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsAtencionMedica obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = " Update atencionmedica " 
                    +"set especialidad = '"+obj.getEspecialidad()+"'," 
                    +"paciente_DNI = '"+obj.getDNIPaciente()+"' " 
                    +"where idAtencionMedica= '"+obj.getIdAtencionMedica()+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsAtencionMedica> listado() throws Exception{
        ArrayList<clsAtencionMedica> lista = new ArrayList<>();
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
                clsAtencionMedica obj = new clsAtencionMedica(rs.getInt("idAtencionMedica"), rs.getString("especialidad"),
                    rs.getString("Paciente_DNI"));
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
