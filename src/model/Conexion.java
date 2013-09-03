/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
/**
 *
 * @author csardev
 */
public class Conexion {
    private String driver = "org.postgresql.Driver";
    private String bd = "tuchvolvbd";
    private String login = "postgres";
    private String password = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/" + bd;
    public Connection conn;
    private Statement stmt;
    
    public void abrirConexion() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            stmt = conn.createStatement();

        } catch ( Exception  e ){
            System.out.println("Error al Conectar cn la BD: "+bd+" "+ e.getMessage());
        }
    }
    public void cerrarConnexion() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e + "error cerrar");
        }
    }
    public ResultSet consultar(String consulta){
      ResultSet res = null;  
      try{
            res = stmt.executeQuery(consulta);            
       }
       catch(Exception e){
            System.out.println(e+"Error al Ejecutar la Consulta:"+consulta+" ");
       }        
       return res; 
    }
    
}
