/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton.model;

/**
 *
 * @author said
 */
public class Unica {

    private static Unica instancia = null;
    private String mensagem;

    public static Unica getInstancia() {
        if (instancia == null) {
            instancia = new Unica();
        }
        return instancia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
