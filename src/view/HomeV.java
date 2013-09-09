/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author csardev
 */

public class HomeV extends JPanel {
    
    private JPanel catalogos, movimientos;
    public JButton productos, clientes, maquinaria, vehiculos, repuestos, materiales,
                    ventas, compras, gastos, inventario, reportes;
    public HomeV(){
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("H O M E"));
        GUIConstraints cons = new GUIConstraints();
        ConstraintGroup cg = new ConstraintGroup(cons.gMain,cons.wMain);
        iniciarComponentes();
        this.add(catalogos,cg.getConstraints(0));
        this.add(movimientos,cg.getConstraints(1));

        
    }

    private void iniciarComponentes() {
        //inicializando paneles y asignando border con titulo
        catalogos = new JPanel(new GridLayout(6, 1));
        catalogos.setBorder(BorderFactory.createTitledBorder("Catalogos"));
        movimientos = new JPanel(new GridLayout(5, 1));
        movimientos.setBorder(BorderFactory.createTitledBorder("Movimientos"));
        //inicializando botones catalogos y anadiendo a catalogos
        productos = new JButton("PRODUCTOS");
        clientes = new JButton("CLIENTES");
        maquinaria = new JButton("MAQUINARIA");
        vehiculos = new JButton("VEHICULOS");
        repuestos = new JButton("REPUESTOS");
        materiales = new JButton("MATERIALES");
        catalogos.add(productos);
        catalogos.add(clientes);
        catalogos.add(maquinaria);
        catalogos.add(vehiculos);
        catalogos.add(repuestos);
        catalogos.add(materiales);
        //inicializando botones catalogos y anadiendo a catalogos
        ventas = new JButton("VENTAS");
        compras = new JButton("COMPRAS");
        gastos = new JButton("GASTOS");
        inventario = new JButton("INVENTARIO");
        reportes = new JButton("REPORTES");
        movimientos.add(ventas);
        movimientos.add(compras);
        movimientos.add(gastos);
        movimientos.add(inventario);
        movimientos.add(reportes);
    }

    private static final class GUIConstraints {

        private final int NONE = GridBagConstraints.NONE;
        private final int BOTH = GridBagConstraints.BOTH;
        private final int SOUT = GridBagConstraints.SOUTH;
        private final int CENT = GridBagConstraints.CENTER;
        private final int WEST = GridBagConstraints.WEST;
        private final int SOEA = GridBagConstraints.SOUTHEAST;
        private final int HORI = GridBagConstraints.HORIZONTAL;
        private final int RELA = GridBagConstraints.RELATIVE;
        private final int REMA = GridBagConstraints.REMAINDER;
        final int[][] gMain = new int[][] {
            {0, 0}, {RELA, RELA}, {BOTH, CENT}, {0, 0, 0, 0},
            {1, 0}, {REMA, REMA}, {BOTH, CENT}, {0, 0, 0, 0}
            
        };
        final double[][] wMain = new double[][] {
            {1.0, 1.0},
            {1.0, 1.0}
            
        };
    }
    
   
}

