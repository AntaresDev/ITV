/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Container;
import java.awt.event.ActionListener;
import model.LoginM;
import view.LoginV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo;

/**
 *
 * @author csardev
 */
public class LoginC implements ActionListener{
    private LoginM modelo;
    private LoginV vista;
    private String nombre,rol;
    Modelo modeloPadre;
    public LoginC(LoginM modelo,LoginV vista, Modelo modeloPadre){
        this.modelo = modelo;
        this.vista = vista;
        this.modeloPadre = modeloPadre;
        vista.initComponentes();
        anadirEventos();
    }

    public LoginV getVista() {
        return vista;
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                int res = modelo.verificarUsr(vista.getLogin(),vista.getPass());
                if(res==0){
                    System.out.println("Usuario Conectado login exitoso");
                    modelo.obtenerDatos();
                    modeloPadre.setNombres(modelo.getNombres());
                    modeloPadre.setApellidos(modelo.getApellidos());
                    modeloPadre.setRol(modelo.getRol());
                    
                }else{if(res==-1){
                        System.out.println("Contrasenia Incorrecta");
                     }else{
                        System.out.println("El Usuario no existe");
                     }
                }
            break;
            case "Borrar":
                vista.txtnickname.setText("");
                vista.txtpass.setText("");
            break;
        }
    }

    private void anadirEventos() {
        vista.btnlogin.addActionListener(this);
        vista.btnlimpiar.addActionListener(this);
    }
    
}
