/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itv;
import controller.Controlador;
import model.Modelo;
import view.Vista;
/**
 *
 * @author csardev
 */
public class ITV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //nuevas instancias de clase
        Modelo modelo = new Modelo();
        Vista vista = new Vista();        
        Controlador controlador = new Controlador( vista , modelo );
        //se inicia la vista
        /*controlador.iniciar_vista();

        vista.setVisible(true);*/
    }
}
