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
public class AtacarNorte implements Estrategia {

    @Override
    public void atacar() {
        JOptionPane.showMessageDialog(null, "Reunir tropas e atacar pelo norte!");
    }

    @Override
    public void concluir() {
        JOptionPane.showMessageDialog(null, "Ataque pelo norte feito!");
    }

}
