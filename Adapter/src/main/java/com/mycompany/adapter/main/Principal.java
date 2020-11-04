/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.main;

import com.mycompany.adapter.model.ClienteExemplo;

/**
 *
 * @author said
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteExemplo cliente = new ClienteExemplo();

        cliente.iniciaAlvos(); //instancia um ClienteExistente ou Alvo para utilizar seu metodo
        cliente.executaAlvos();//executa a operacao de ClienteExistente por meio da interface Alvos
    }

}
