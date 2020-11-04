/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy.model;

import com.mycompany.strategy.interfaces.Estrategia;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class Cerco implements Estrategia {

    @Override
    public void atacar() {
        JOptionPane.showMessageDialog(null, "Cerquem as estradas para cancelar a entrada de suprimentos inimigos!");
    }

    @Override
    public void concluir() {
         JOptionPane.showMessageDialog(null,"Inimigos se renderam devido a falta de suprimentos.");
    }

}
