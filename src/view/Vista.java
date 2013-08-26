/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

/**
 *
 * @author csardev
 */
public class Vista extends JFrame {

    public Vista() {
        System.out.println("Creando Vista!!!!");
    }
    public void iniciarVista(){
        this.setLayout(new FlowLayout());
        this.setBounds(350, 200, 350, 120);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        //this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public LoginV getLoginV(){
        LoginV res = new LoginV();
        return res;
    }
  
}
