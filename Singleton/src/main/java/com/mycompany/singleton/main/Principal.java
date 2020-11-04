/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton.main;

import com.mycompany.singleton.model.Unica;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //não ira funcionar
        //Unica u = new Unica();

        Unica u1 = Unica.getInstancia();
        u1.setMensagem("Eu sou uma classe única.");

        Unica u2 = Unica.getInstancia();

        if (u1.equals(u2)) {
            JOptionPane.showMessageDialog(null, "u1 e u2 são o mesmo objeto"
                    + "\n" + u1 + "\n" + u2);
        }
    }

}
