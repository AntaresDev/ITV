/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author csardev
 */
public class Modelo {
    private Conexion conexion;
    private String nombres, apellidos, rol, nickname;
    public Modelo(){
        System.out.println("Creando Modelo!!!!");
        conexion = new Conexion();
        nombres = apellidos = rol = nickname = "";
        
    }
    public LoginM getLoginM(){
        LoginM res = new LoginM(conexion);
        return res;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}
