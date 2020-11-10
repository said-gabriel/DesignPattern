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
public class Publicacao extends Estado {

    public Publicacao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void publicar() {
        JOptionPane.showMessageDialog(null, "Seu Artigo foi publicado!");
    }

    @Override
    public void revisar() {
        JOptionPane.showMessageDialog(null, "Seu Artigo está incompleto, volte e revise-o!");
        artigo.setEstadoArtigo(new Revisao(this.getArtigo()));
    }
}
