/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.factorymethod.main;

import br.ufes.factorymethod.models.Mensageiro;
import br.ufes.factorymethod.models.MensagemFabrica;
import br.ufes.fectorymethod.interfaces.IFabrica;
import javax.swing.JOptionPane;

/**
 *
 * @author 55289
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IFabrica fabricaDeMensagem = new MensagemFabrica();
        Mensageiro James = new Mensageiro(fabricaDeMensagem, "sms");
        Mensageiro Curry = new Mensageiro(fabricaDeMensagem, "telegram");
        Mensageiro Lillard = new Mensageiro(fabricaDeMensagem, "whatsapp");

        
        JOptionPane.showMessageDialog(null, James.getMensagem().enviarMensagem("Olá sou o James!"));
        JOptionPane.showMessageDialog(null, Curry.getMensagem().enviarMensagem("Olá sou o Curry!"));
        JOptionPane.showMessageDialog(null, Lillard.getMensagem().enviarMensagem("Olá sou o Lillard!"));
    }

}
