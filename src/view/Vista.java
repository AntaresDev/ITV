/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author csardev
 */
public class Vista extends JFrame {
    private JMenuBar mb;
    private JMenu menu1;
    public JMenuItem mi1;
    public JPanel panelAuxCentral, panelUsuario;
    public JLabel lblwelcome, lblprivilegio, lblnickname, lblcargo;
    public JButton btncuenta, btnhelp, btnexit;

    public Vista() {
        
        panelAuxCentral= new JPanel(new BorderLayout());
    }
    public void iniciarVista(){
        this.setLayout(new BorderLayout());
        
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.pack();
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        
        
        this.add(panelAuxCentral, BorderLayout.CENTER);
        iniciarMenu();
        
    }
    
    public void iniciarMenu(){
        mb=new JMenuBar();
        this.setJMenuBar(mb);
        menu1=new JMenu("Menu");
        mb.add(menu1);
        mi1=new JMenuItem("Salir");
        menu1.add(mi1);
        
        
    }
    public LoginV getLoginV(){
        LoginV res = new LoginV();
        return res;
    }

    public void anadirHomeV(HomeV panel) {
        
        panelAuxCentral.removeAll();
        panelAuxCentral.repaint();
        panelAuxCentral.add(panel,BorderLayout.CENTER);
        panelAuxCentral.validate();
        this.pack();
    }
    public void anadirLoginV(LoginV panel) {
        panelAuxCentral.removeAll();
        panelAuxCentral.repaint();
        panelAuxCentral.add(panel,BorderLayout.CENTER);
        panelAuxCentral.validate();
        this.pack();
    }

    public void anadirPanelUsuario(String nickname, String privilegio) {
        panelUsuario = new JPanel(new FlowLayout());
        panelUsuario.setBorder(BorderFactory.createEtchedBorder());
        lblwelcome = new JLabel("BINVENIDO:");
        lblprivilegio = new JLabel("PRIVILEGIO:");
        lblnickname = new JLabel(nickname);
        lblcargo = new JLabel(privilegio);
        btncuenta = new JButton("USR");
        btnhelp= new JButton("HELP");
        btnexit= new JButton(" X ");
        this.add(panelUsuario, BorderLayout.NORTH);
        panelUsuario.removeAll();
        panelUsuario.repaint();
        panelUsuario.add(lblwelcome);
        panelUsuario.add(lblnickname);
        panelUsuario.add(lblprivilegio);
        panelUsuario.add(lblcargo);
        panelUsuario.add(btncuenta);
        panelUsuario.add(btnhelp);
        panelUsuario.add(btnexit);
        panelUsuario.validate();
        this.pack();    
    
    }
    public void limpiarTodo(){
        panelAuxCentral.removeAll();
        panelAuxCentral.repaint();
        panelAuxCentral.validate();
        panelUsuario.removeAll();
        panelUsuario.repaint();
        panelUsuario.validate();
        this.remove(panelUsuario);
        
    }
   
}
