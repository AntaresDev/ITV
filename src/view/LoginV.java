/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
    public JButton btnlogin,btnlimpiar;
    public GUIConstraintsLogin cons; 
    public ConstraintGroup cg;
    public LoginV(){
        this.setLayout(new GridBagLayout());
        cons = new GUIConstraintsLogin();
        cg = new ConstraintGroup(cons.gMain,cons.wMain);
    }
    
    public void initComponentes(){
        lblnickname = new JLabel("Nickname");
        lblpass = new JLabel("Contrasena");
        txtnickname = new JTextField(20);
        txtpass = new JPasswordField(20);
        btnlogin = new JButton("Login");
        btnlimpiar = new JButton("Borrar");
        this.add(lblnickname,cg.getConstraints(0));
        this.add(txtnickname,cg.getConstraints(1));
        this.add(lblpass,cg.getConstraints(2));
        this.add(txtpass,cg.getConstraints(3));
        this.add(btnlogin,cg.getConstraints(4));
        this.add(btnlimpiar,cg.getConstraints(5));
    }
    public String getLogin(){
        return txtnickname.getText();
    }
    public String getPass(){
        return txtpass.getText();
    }
    
    private static final class GUIConstraintsLogin {

        private final int NONE = GridBagConstraints.NONE;
        private final int    BOTH = GridBagConstraints.BOTH;
        private final int SOUT = GridBagConstraints.SOUTH;
        private final int CENT = GridBagConstraints.CENTER;
        private final int WEST = GridBagConstraints.WEST;
        private final int SOEA = GridBagConstraints.SOUTHEAST;
        private final int HORI = GridBagConstraints.HORIZONTAL;
        private final int RELA = GridBagConstraints.RELATIVE;
        private final int REMA = GridBagConstraints.REMAINDER;
        final int[][] gMain = new int[][] {
            {0, 0}, {1, 1}, {BOTH, WEST}, {2, 5, 2, 0},
            {1, 0}, {1, 1}, {BOTH, WEST}, {2, 0, 2, 5},
            {0, 1}, {1, 1}, {BOTH, WEST}, {2, 5, 2, 0},
            {1, 1}, {1, 1}, {BOTH, WEST}, {2, 0, 2, 5},
            {0, 2}, {1, 1}, {BOTH, WEST}, {2, 5, 2, 0},
            {1, 2}, {REMA, RELA}, {BOTH, WEST}, {2, 0, 2, 5}
        };
        final double[][] wMain = new double[][] {
            {0.4, 1.0},
            {1.0, 1.0},
            {0.4, 1.0},
            {1.0, 1.0},
            {0.4, 1.0},
            {1.0, 1.0}
        };
    }

}
