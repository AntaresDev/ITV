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
    private String nickname;
    private String pass;
    public LoginM(){
        nickname = "";
        pass = "";
    }

    public int verificarUsr(String nickname, String pass){
        int res=3;
        this.nickname = nickname;
        this.pass =pass;
        Conexion con = new Conexion();
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
    
}
