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

/**
 *
 * @author csardev
 */
public class LoginC implements ActionListener{
    private LoginM modelo;
    private LoginV vista;
    public LoginC(LoginM modelo,LoginV vista){
        this.modelo = modelo;
        this.vista = vista;
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
                System.out.println("Login");
                int res = modelo.verificarUsr(vista.getLogin(),vista.getPass());
                if(res==0){
                    System.out.println("Usuario Conectado login exitoso");
                }else{if(res==-1){
                        System.out.println("Contrasenia Incorrecta");
                     }else{
                        System.out.println("El Usuario no existe");
                     }
                }
                break;
            case "Cancelar":
                System.out.println("Cancelar");
                
                break;
        }
    }

    private void anadirEventos() {
        vista.btnlogin.addActionListener(this);
        vista.btncancelar.addActionListener(this);
    }
    
}
