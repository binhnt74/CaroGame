/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caro;

/**
 *
 * @author binhm
 */
public class Caro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Hello");
                new MainJFrame().setVisible(true);
            }
        });
    }
    
}
