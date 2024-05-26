/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsCitaMedica;
import Entidades.clsCitaMedicaDetalle;
import Entidades.clsServicioMedico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsCitaMedicaDAO {        
    
    //INSERT INTO
    public void agregar(clsCitaMedica obj, Connection cn, ArrayList<clsServicioMedico> listaServicios) throws Exception{
        //Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        clsServicioMedicoDAO objDAO = new clsServicioMedicoDAO();
        
        try {
            sentenciaSQL = "insert into citamedica values(null, '"+obj.getFecha()+"','"
                +obj.getDiagnostico()+"',"+obj.getIdAtencionMedica()+","+obj.getIdServicioMedico()+",'"+obj.getIdDoctor()+"');";
            //cn = clsConexion.getConexion();
            for (clsServicioMedico objS : listaServicios) {
                if(objS.getIdServicioMedico() == obj.getIdServicioMedico()){
                    objDAO.modificarCupos(objS.getIdServicioMedico(), objS.getNumeroCupos(), cn);
                }
            } 
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);                       
            //cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsCitaMedica obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update citamedica " 
                    +" set fecha = '"+obj.getFecha()+"'," 
                    +"diagnostico = '"+obj.getDiagnostico()+"'," 
                    +"AtencionMedica_idAtencionMedica = "+obj.getIdAtencionMedica()+"," 
                    +"ServicioMedico_idServicioMedico = "+obj.getIdServicioMedico()+"," 
                    +"Doctor_idDoctor = '"+obj.getIdDoctor()+"' " 
                    +" where idCitaMedica= '"+obj.getIdCitaMedica()+"';";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarDiagnostico(String diagnostico, int idAux) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update citamedica " 
                    +" set diagnostico = '"+diagnostico+"' " 
                    +" where idCitaMedica= '"+idAux+"';";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsCitaMedica> listado() throws Exception{
        ArrayList<clsCitaMedica> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from citamedica";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsCitaMedica obj = new clsCitaMedica(rs.getInt("idCitaMedica"), rs.getString("fecha"),
                        rs.getString("diagnostico"),rs.getInt("AtencionMedica_idAtencionMedica"),rs.getInt("ServicioMedico_idServicioMedico"),
                        rs.getString("Doctor_idDoctor"));
                lista.add(obj);
            }
            //st.executeUpdate(sentenciaSQL);
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
    public ArrayList<clsCitaMedicaDetalle> listado_PF(String dniAux) throws Exception{
        ArrayList<clsCitaMedicaDetalle> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "select cm.idCitaMedica, cm.fecha, am.especialidad, d.nombres, d.apPaterno, d.apMaterno " +
                "from atencionmedica am INNER JOIN citamedica cm ON am.idAtencionMedica = cm.AtencionMedica_idAtencionMedica " +
                "INNER JOIN doctor d on cm.Doctor_idDoctor = d.idDoctor " +
                "WHERE am.Paciente_DNI = '"+dniAux+"';";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsCitaMedicaDetalle obj = new clsCitaMedicaDetalle(rs.getInt("idCitaMedica"), rs.getString("fecha"),
                rs.getString("especialidad"), rs.getString("nombres"), rs.getString("apPaterno"), rs.getString("apMaterno"));
                lista.add(obj);
            }
            //st.executeUpdate(sentenciaSQL);
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
    public ArrayList<clsCitaMedicaDetalle> listado_Con_Diagnostico(String dniAux) throws Exception{
        ArrayList<clsCitaMedicaDetalle> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "select cm.idCitaMedica, cm.fecha, cm.diagnostico, d.nombres, d.apPaterno, d.apMaterno\n" 
                    +"from atencionmedica am INNER JOIN citamedica cm ON am.idAtencionMedica = cm.AtencionMedica_idAtencionMedica\n" 
                    +"	INNER JOIN doctor d on cm.Doctor_idDoctor = d.idDoctor\n" 
                    +"WHERE am.Paciente_DNI = '"+dniAux+"';";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsCitaMedicaDetalle obj = new clsCitaMedicaDetalle(rs.getInt("idCitaMedica"), rs.getString("fecha"),
                rs.getString("diagnostico"), rs.getString("nombres"), rs.getString("apPaterno"), rs.getString("apMaterno"));
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
