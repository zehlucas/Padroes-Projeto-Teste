/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaojavatestegit;

import Frames.inicial;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Peres
 */
public class AplicacaoJavaTesteGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Qualquer semelhança é mera coincidência!");
        inicial inicial = new inicial();
        inicial.setVisible(true);
        System.out.println("nova mensagem");
    }
    
}
