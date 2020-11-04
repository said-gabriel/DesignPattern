/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.model;

import com.mycompany.designpattern.interfaces.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class InMetro implements Observer {

    public EstacaoMeteorologica estacao;

    public InMetro(EstacaoMeteorologica estacao) {
        this.estacao = estacao;
    }

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null, ""
                + "Inmetro dados atualizados:"
                + "\n Pressao: " + String.format("%.2f", estacao.getPressao())
                + "\n Temperatura: " + String.format("%.2f", estacao.getTemperatura())
                + "\n Umidade: " + String.format("%.2f", estacao.getUmidade()));
    }

}
