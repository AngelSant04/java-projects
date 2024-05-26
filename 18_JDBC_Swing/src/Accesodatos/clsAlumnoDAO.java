/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import entidades.clsAlumno;
import entidades.clsEscuela;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsAlumnoDAO {
    //INSERT INTO
    public void agregar(clsAlumno obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "insert into alumno values('"+obj.getCodigo()+"', '"+obj.getNombres()+"', '"
                    +obj.getApPaterno()+"', '"+obj.getApMaterno()+"',"+obj.getEdad()+","+obj.getIdescuela()+")";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //UPDATE
    public void modificar(clsAlumno obj) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sentenciaSQL = "";
        try {
            sentenciaSQL = "Update alumno " 
                    +"set nombres = '"+obj.getNombres()+"'," 
                    +"	apPaterno = '"+obj.getApPaterno()+"'," 
                    +"	apMaterno = '"+obj.getApMaterno()+"'," 
                    +"    edad = "+obj.getEdad()+"," 
                    +"    Escuela_idEscuela = "+obj.getIdescuela()+" " 
                    +"where codigo = '"+obj.getCodigo()+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sentenciaSQL);
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    //SELECT
    public ArrayList<clsAlumno> listado() throws Exception{
        ArrayList<clsAlumno> lista = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        
        try {
            sql = "Select * from alumno";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);  //CONSULTA
            while(rs.next()){
                clsAlumno obj = new clsAlumno(rs.getString("codigo"), rs.getString("nombres"), 
                        rs.getString("apPaterno"), rs.getString("apMaterno"), rs.getInt("edad"), 
                        rs.getInt("Escuela_idEscuela"));
                lista.add(obj);
            }
            //st.executeUpdate(sentenciaSQL);
            cn.close();
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
//    private boolean buscarAlumno(String codigo){
//        
//    }
//    
//    private clsAlumno buscarAlumnoCompleto(String codigo){
//        
//    }
//    
//    private ArrayList<clsAlumno> listadoPorEscuela(int idEscuela){
//        
//    }
}
