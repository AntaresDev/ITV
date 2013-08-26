/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Modelo;
import view.Vista;

/**
 *
 * @author csardev
 */
public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Vista vista, Modelo modelo) {
        this.modelo=modelo;
        this.vista=vista;
        iniciarVista();
        
    }

    public void iniciarVista() {
        vista.setTitle("Importadora Tuch Volv");
        vista.iniciarVista();
        iniciarLogin();
    }
    
    public void iniciarLogin(){
      LoginC loginc =new LoginC(modelo.getLoginM(), vista.getLoginV());
      vista.setContentPane(loginc.getVista());
      
    }
    
}
