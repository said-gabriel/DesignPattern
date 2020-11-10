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
public class Revisao extends Estado {

    public Revisao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void tentarPublicar() {
        JOptionPane.showMessageDialog(null, "Seu Artigo foi promovido para análise de publicação!");
        artigo.setEstadoArtigo(new Publicacao(this.getArtigo()));

    }

    @Override
    public void iniciarOuReiniciar() {
        JOptionPane.showMessageDialog(null, "Seu rascunho do Artigo ainda está incompleto, reinicie-o!");
        artigo.setEstadoArtigo(new Rascunho(this.getArtigo()));

    }

}
