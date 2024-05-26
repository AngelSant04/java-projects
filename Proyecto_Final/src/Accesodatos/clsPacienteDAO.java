/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import Entidades.clsPaciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsPacienteDAO {
    //METODOS para enviar sentencias a la base de datos
    //SENTENCIAS: Insert Into, Update, Select, Delete
    
    //INSERT INTO
    public void agregar(clsPaciente obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {            
            sentenciaSQL = "insert into paciente values('"+obj.getDni()+"', '"+obj.getNombres()+"', '"
                    +obj.getApPaterno()+"', '"+obj.getApMaterno()+"',"+obj.getEdad()+",'"
                    +obj.getSexo()+"',"+obj.getTelefono()+",'"+obj.getIdHistorialClinico()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
        /* insert into usuario values('"+obj.getidUsuario+"', '"+obj.getNombre+"', 
        '"+obj.getapPaterno+"', '"+obj.getapMaterno+"','"+obj.getCargo+"','"+obj.getPasword+"');*/
        
    }
    
    //UPDATE
    public void modificar(clsPaciente obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update paciente "
                +"set nombres = '"+obj.getNombres()+"'," 
                +"apPaterno = '"+obj.getApPaterno()+"'," 
                +"apMaterno = '"+obj.getApMaterno()+"',"
                +"edad = "+obj.getEdad()+","
                +"sexo = '"+obj.getSexo()+"',"
                +"telefono = "+obj.getTelefono()+","
                +"HistorialClinico = '"+obj.getIdHistorialClinico()+"' "
                +"where DNI = '"+obj.getDni()+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsPaciente> listado() throws Exception{
        ArrayList<clsPaciente> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from paciente";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsPaciente obj = new clsPaciente(rs.getString("DNI"), rs.getString("nombres"), 
                        rs.getString("apPaterno"), rs.getString("apMaterno"), 
                        Integer.parseInt(rs.getString("edad")), rs.getString("sexo"), 
                        Integer.parseInt(rs.getString("telefono")), rs.getString("HistorialClinico"));        
                lista.add(obj);
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
    public clsPaciente buscar(String DniAux) throws Exception{
        clsPaciente paciente = null;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from paciente where DNI = '"+DniAux+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsPaciente obj = new clsPaciente(rs.getString("DNI"), rs.getString("nombres"), 
                        rs.getString("apPaterno"), rs.getString("apMaterno"), 
                        Integer.parseInt(rs.getString("edad")), rs.getString("sexo"), 
                        Integer.parseInt(rs.getString("telefono")), rs.getString("HistorialClinico"));        
                paciente = obj;
            }
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return paciente;
    }
}
