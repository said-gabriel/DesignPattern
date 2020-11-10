/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.state.models;

/**
 *
 * @author 55289
 */
public abstract class Estado {

    protected Artigo artigo;

    public Estado(Artigo artigo) {
        this.artigo = artigo;
    }

    public void revisar() {
        throw new RuntimeException("Este artigo não está em condição de ser revisado!");
    }

    public void publicar() {
        throw new RuntimeException("Este artigo não está com condição de ser publicado!");
    }

    public void iniciarOuReiniciar() {
        throw new RuntimeException("Este artigo não está em condição de ser iniciado/reiniciado!");
    }

    public void tentarPublicar() {
        throw new RuntimeException("Este artigo não está em condições de ser publicado ainda! Volte para revisao");
    }

    public Artigo getArtigo() {
        return this.artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
}
