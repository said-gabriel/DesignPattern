/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainresponsability.main;

import com.mycompany.chainresponsability.model.Batalha;

/**
 *
 * @author said
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Batalha batalhaDoGolfo = new Batalha();
        batalhaDoGolfo.definirEstrategia("cc");
        batalhaDoGolfo.iniciar();
        batalhaDoGolfo.concluir();
    }

}
