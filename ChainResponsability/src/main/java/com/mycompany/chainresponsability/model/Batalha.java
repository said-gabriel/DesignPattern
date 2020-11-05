/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainresponsability.model;

import com.mycompany.chainresponsability.interfaces.Estrategia;

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
        this.estrategia = definir(codigoBatalha);

    }

    public void iniciar() {
        estrategia.atacar();
    }

    public void concluir() {
        estrategia.concluir();
    }

    private Estrategia definir(String cod) {
        //Estrategia h1 = new AliancaVizinho(null);
        //Estrategia h2 = new AtacarNorte((AliancaVizinho) h1);
        Estrategia h3 = new Cerco(null);
        Estrategia h4 = new Diplomacia((Cerco) h3);

        Estrategia definitiva = h4.verifica(cod);

        return definitiva;
    }
}
