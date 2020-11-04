/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy.model;

import com.mycompany.strategy.interfaces.Estrategia;

/**
 *
 * @author said
 */
public class Batalha {

    private Estrategia estrategia;

    public Batalha() {
        this.estrategia = null;
    }

    public void definirEstrategia(String codigoBatalha) {
        if (codigoBatalha.equals("cerco")) {
            this.estrategia = new Cerco();
        }
        if (codigoBatalha.equals("atacar norte")) {
            this.estrategia = new AtacarNorte();
        }
        if (codigoBatalha.equals("diplomacia")) {
            this.estrategia = new Diplomacia();
        }
        if (codigoBatalha.equals("aliança")) {
            this.estrategia = new AliancaVizinho();
        }

    }

    public void iniciar() {
        estrategia.atacar();
    }

    public void concluir() {
        estrategia.concluir();
    }

}
