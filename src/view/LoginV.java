/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author csardev
 */
public class LoginV extends JPanel {
    public JLabel lblnickname, lblpass ;
    public JTextField txtnickname;
    public JPasswordField txtpass;
    public JButton btnlogin,btncancelar;
    public LoginV(){
        this.setLayout(new FlowLayout());
    }
    
    public void initComponentes(){
        lblnickname = new JLabel("Nickname");
        lblpass = new JLabel("Contrasena");
        txtnickname = new JTextField(20);
        txtpass = new JPasswordField(20);
        btnlogin = new JButton("Login");
        btncancelar = new JButton("Cancelar");
        this.add(lblnickname);
        this.add(txtnickname);
        this.add(lblpass);
        this.add(txtpass);
        this.add(btnlogin);
        this.add(btncancelar);
    }
    public String getLogin(){
        return txtnickname.getText();
    }
    public String getPass(){
        return txtpass.getText();
    }
}
