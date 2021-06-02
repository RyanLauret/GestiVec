/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thega
 */
public class Application_Vehicule {
    
        public static void main(String args[]) {
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Vehicule_App().setVisible(true);
                }
            });
            
        }
}