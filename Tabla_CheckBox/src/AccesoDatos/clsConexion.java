/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;


public class clsConexion {
    public static Connection getConexion() throws Exception{
        Connection cn = null;
        String ruta = "";
        
        //JDBC: Java Data Base Conectivity
        
        try {   //Codigo normal, podria tener ERROR
            Class.forName("com.mysql.jdbc.Driver");
            ruta = "jdbc:mysql://localhost:3306/db_gestionmedica?autoReconnect=true";
            cn = DriverManager.getConnection(ruta,"root","");
        } catch (Exception e) { //Atrapa el ERROR
            throw e;        //Devolver el error a un nivel superior
        }
        return cn;
    }
}
