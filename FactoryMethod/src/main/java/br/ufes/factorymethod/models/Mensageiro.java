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
public class Mensageiro {
    IMensagem mensagem;
    IFabrica fabricaMensagem;
    
    public Mensageiro(IFabrica fabrica,String id){
        this.fabricaMensagem = fabrica;
        this.mensagem = fabrica.criar(id);
    }

    public IMensagem getMensagem() {
        return mensagem;
    }
    
}
