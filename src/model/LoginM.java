/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author csardev
 */
public class LoginM {
    private String nickname, pass, nombres, apellidos, rol;
    private Conexion con;
    public LoginM(Conexion conexion){
        nickname =pass=nombres=apellidos=rol= "";
        con = conexion;
        
    }

    public int verificarUsr(String nickname, String pass){
        int res=3;
        this.nickname = nickname;
        this.pass =pass;
        con.abrirConexion();
        String consulta = "SELECT verificar_usuario('"+this.nickname+"'"+", '"+this.pass+"');";
        System.out.println(consulta);
        try {
            Statement comando = con.conn.createStatement();
            ResultSet rs = comando.executeQuery(consulta);

            while(rs.next()){ 
                String resultadoconsulta=rs.getString(1);
                res = Integer.parseInt(resultadoconsulta);
                
            } 
            rs.close();
            comando.close();
            con.cerrarConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "error consulta vericar_usuario");
        }
        
        return res;
    }

    public void obtenerDatos() {
        con.abrirConexion();
        String consulta = "SELECT nombres, apellidos, cargo FROM empleado  where nickname ='"+nickname+"'";
        System.out.println(consulta);
        try {
            ResultSet rs = con.consultar(consulta);

            while(rs.next()){ 
                 nombres = rs.getString("nombres");
                 apellidos = rs.getString("apellidos");
                 rol = rs.getString("cargo");
            } 
            rs.close();
            con.cerrarConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "error consulta obtener datos");
        }
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    
}
