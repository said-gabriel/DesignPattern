/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.state.models;

import javax.swing.JOptionPane;

/**
 *
 * @author 55289
 */
public class Rascunho extends Estado {

    public Rascunho(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void revisar() {
        JOptionPane.showMessageDialog(null, "Seu rascunho de Artigo foi para revisão!");
        artigo.setEstadoArtigo(new Revisao(this.getArtigo()));
    }
    @Override
    public void iniciarOuReiniciar(){
        JOptionPane.showMessageDialog(null, "Seu rascunho de Artigo foi iniciado!");
    }

}
