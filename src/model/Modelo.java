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
    public Modelo(){
        System.out.println("Creando Modelo!!!!");
        conexion = new Conexion();
        
    }
    public LoginM getLoginM(){
        LoginM res = new LoginM();
        return res;
    }
    
}
