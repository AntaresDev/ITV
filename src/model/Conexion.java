/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author csardev
 */
public class Conexion {
    private String bd = "tuchvolvbd";
    private String login = "postgres";
    private String password = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/" + bd;
    public Connection conn = null;

    public void abrirConexion() {
        try {
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
            }
        } catch (SQLException e) {
            System.out.println(e + "error abrir");
        }
    }

    public void cerrarConnexion() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            System.out.println(e + "error cerrar");
        }
    }
    public void pruebaBase() {
        this.abrirConexion();
        String consulta = "SELECT * FROM empleado";
        try {
            Statement comando = conn.createStatement();
            ResultSet rs = comando.executeQuery(consulta);
            
            while (rs.next()) {
                ArrayList<String> lista = new ArrayList();
                String id_empleado = rs.getString("idempleado");
                String nickname = rs.getString("nickname");
                String contrasenia = rs.getString("contrasenia");
                String cargo = rs.getString("cargo");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String ciudad = rs.getString("ciudad");
                String departamento = rs.getString("departamento");
                String correo = rs.getString("correo");

                lista.add(id_empleado);
                lista.add(nickname);
                lista.add(contrasenia);
                lista.add(cargo);
                lista.add(nombres);
                lista.add(apellidos);
                lista.add(telefono);
                lista.add(direccion);
                lista.add(ciudad);
                lista.add(departamento);
                lista.add(correo);
                for (Iterator<String> it = lista.iterator(); it.hasNext();) {
                    String string = it.next();
                    System.out.print("  " + string);
                }
                System.out.println("");
            }
            rs.close();
            comando.close();
            this.cerrarConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "error consulta prueba base");
        }
    }
    
}
