/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.LoginM;
import model.Modelo;
import view.HomeV;
import view.LoginV;
import view.Vista;

/**
 *
 * @author csardev
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;
    private LoginV vista_login;
    private LoginM modelo_login;
    

    public Controlador(Vista vista, Modelo modelo) {
        this.modelo=modelo;
        this.vista=vista;
        iniciarVista();
        anadirEventosMenu();       
    }

    public void iniciarVista() {
        vista.setTitle("Importadora Tuch Volv");
        vista.iniciarVista();
        iniciarLogin();
    }
    public void anadirEventosMenu(){
        vista.mi1.addActionListener(this);
    }
    public void iniciarLogin(){
      
      modelo_login = modelo.getLoginM();
      vista_login = vista.getLoginV();
      vista_login.initComponentes();
      anadirEventosLogin();
      vista.anadirLoginV(vista_login);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.mi1) {
            vista.dispose();
            
        }
        switch (e.getActionCommand()) {
            case "Login":
                int res = modelo_login.verificarUsr(vista_login.getLogin(),vista_login.getPass());
                if(res==0){
                    System.out.println("Usuario Conectado login exitoso");
                    modelo_login.obtenerDatos();
                    modelo.setNombres(modelo_login.getNombres());
                    modelo.setApellidos(modelo_login.getApellidos());
                    modelo.setRol(modelo_login.getRol());
                    modelo.setNickname(vista_login.getLogin());
                    HomeV homev = new HomeV();
                    anadirEventosHome(homev);
                    vista.anadirPanelUsuario(modelo.getNickname(),modelo.getRol());
                    anadirEventosUsuario();
                    vista.anadirHomeV(homev);
                    
                }else{if(res==-1){
                        System.out.println("Contrasenia Incorrecta");
                     }else{
                        System.out.println("El Usuario no existe");
                     }
                }
            break;
            case "Borrar":
                vista_login.txtnickname.setText("");
                vista_login.txtpass.setText("");
            break;
            case "PRODUCTOS":
                System.out.println("PRODUCTOS");
            break;
            case "CLIENTES":
                System.out.println("CLIENTES");
            break;
            case "MAQUINARIA":
                System.out.println("MAQUINARIA");
            break;
            case "VEHICULOS":
                System.out.println("VEHICULOS");
            break;
            case "REPUESTOS":
                System.out.println("REPUESTOS");
            break;
            case "MATERIALES":
                System.out.println("MATERIALES");
            break;
            case "VENTAS":
                System.out.println("VENTAS");
            break;
            case "COMPRAS":
                System.out.println("COMPRAS");
            break;
            case "GASTOS":
                System.out.println("GASTOS");
            break;
            case "INVENTARIO":
                System.out.println("INVENTARIOS");
            break;
            case "REPORTES":
                System.out.println("REPORTES");
            break;
            case "USR":
                System.out.println("USR");
            break;
            case "HELP":
                System.out.println("HELP");
            break;
            case " X ":
                System.out.println("            X                    ");
                modelo.setNombres("");
                modelo.setApellidos("");
                modelo.setRol("");
                modelo.setNickname("");
                vista.limpiarTodo();
                iniciarLogin();
            break;
            
        }
        
        
    }

    private void anadirEventosLogin() {
        vista_login.btnlogin.addActionListener(this);
        vista_login.btnlimpiar.addActionListener(this);
    }
    private void anadirEventosUsuario() {
        vista.btncuenta.addActionListener(this);
        vista.btnhelp.addActionListener(this);
        vista.btnexit.addActionListener(this);
    }
    private void anadirEventosHome(HomeV homev) {
        homev.productos.addActionListener(this);
        homev.clientes.addActionListener(this);
        homev.maquinaria.addActionListener(this);
        homev.vehiculos.addActionListener(this);
        homev.repuestos.addActionListener(this);
        homev.materiales.addActionListener(this);
        homev.ventas.addActionListener(this);
        homev.compras.addActionListener(this);
        homev.gastos.addActionListener(this);
        homev.inventario.addActionListener(this);
        homev.reportes.addActionListener(this);
       
    }
    
}
