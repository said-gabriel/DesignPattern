/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.main;

import com.mycompany.designpattern.interfaces.Observer;
import com.mycompany.designpattern.model.ClimaGoogle;
import com.mycompany.designpattern.model.EstacaoMeteorologica;
import com.mycompany.designpattern.model.InMetro;

/**
 *
 * @author said
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        estacao.add(new InMetro(estacao));
        estacao.add(new ClimaGoogle(estacao));

        estacao.atualizarDados(35.5, 0.36, 0.6);

    }
}
