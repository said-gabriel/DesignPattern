/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.factorymethod.models;

import br.ufes.fectorymethod.interfaces.IFabrica;
import br.ufes.fectorymethod.interfaces.IMensagem;

/**
 *
 * @author 55289
 */
public class MensagemFabrica implements IFabrica {

    @Override
    public IMensagem criar(String id) {
        if (id.toLowerCase().equals("sms")) {
            return new Sms();
        } else if (id.toLowerCase().equals("telegram")) {
            return new Telegram();
        } else if (id.toLowerCase().equals("whatsapp")) {
            return new Whatsapp();
        } else {
            throw new RuntimeException("Fabrica não encontrada para: " + id);
        }

    }

}
