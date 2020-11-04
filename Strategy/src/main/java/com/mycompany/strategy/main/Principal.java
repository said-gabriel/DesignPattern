/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy.main;

import com.mycompany.strategy.model.Batalha;

/**
 *
 * @author said
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        batalha.definirEstrategia("cerco");
        batalha.iniciar();
        batalha.concluir();
    }

}
