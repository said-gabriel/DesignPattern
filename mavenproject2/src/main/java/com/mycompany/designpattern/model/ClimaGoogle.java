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
public class ClimaGoogle implements Observer {

    public EstacaoMeteorologica estacao;

    public ClimaGoogle(EstacaoMeteorologica estacao) {
        this.estacao = estacao;
    }

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null, ""
                + "GoogleClima dados atualizados:"
                + "\n Pressao: " + String.format("%.2f", estacao.getPressao())
                + "\n Temperatura: " + String.format("%.2f", estacao.getTemperatura())
                + "\n Umidade: " + String.format("%.2f", estacao.getUmidade()));
    }
}
