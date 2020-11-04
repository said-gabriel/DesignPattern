/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.model;

import com.mycompany.adapter.interfaces.Alvo;
import java.util.ArrayList;

/**
 *
 * @author said
 */
public class ClienteExemplo {

    ArrayList<Alvo> alvos;

    public ClienteExemplo() {
        alvos = new ArrayList<>();
    }

    public void iniciaAlvos() {
        alvos.add(new Adaptador());
    }

    public void executaAlvos() {
        for (Alvo a : alvos) {
            a.operacao();
        }
    }
}
