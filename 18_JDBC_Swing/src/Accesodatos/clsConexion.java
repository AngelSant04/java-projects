/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsConexion {
    
    public static Connection getConexion() throws Exception{
        Connection cn = null;
        String ruta = "";
        
        //JDBC: Java Data Base Conectivity
        
        try {   //Codigo normal, podria tener ERROR
            Class.forName("com.mysql.jdbc.Driver");
            ruta = "jdbc:mysql://localhost:3306/bd_academico?autoReconnect=true";
            cn = DriverManager.getConnection(ruta,"root","");
        } catch (Exception e) { //Atrapa el ERROR
            throw new SQLException("Error al conectar a la base de datos", e);        //Devolver el error a un nivel superior
        }
        return cn;
    }
}
