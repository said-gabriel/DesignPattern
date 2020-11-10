/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.factorymethod.models;

import br.ufes.fectorymethod.interfaces.IMensagem;

/**
 *
 * @author 55289
 */
public class Telegram implements IMensagem {

   

    @Override
    public String enviarMensagem(String texto) {
        return "'" + texto + "'" + "\n Enviada via Telegram!";
    }

}
