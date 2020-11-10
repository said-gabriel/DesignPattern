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
public class Artigo {
    Estado estadoArtigo;

    public Artigo(){
        
    }
    public void criar(){
        estadoArtigo = new Rascunho(this);
    }
    public void revisar(){ //Um artigo pode ser promovido para revisao(se for Rascunho), ou ser rebaixado para revisao (se for Publicacao)
        estadoArtigo.revisar();
    }
    public void iniciarOuReiniciar(){//Um artigo pode ser iniciar(estado inicial Rascunho), ou ser rebaixado para reiniciar(se for Revisao)
        estadoArtigo.iniciarOuReiniciar();
    }
    public void publicar(){//Um artigo pode ser publicado(se for Publicacao)
        estadoArtigo.publicar();
    }
    public void tentarPublicar(){//Um artigo pode ser promovido para Publicacao(se for Revisao)
        estadoArtigo.tentarPublicar();
    }
    public Estado getEstadoArtigo() {
        return estadoArtigo;
    }

    public void setEstadoArtigo(Estado estadoArtigo) {
        this.estadoArtigo = estadoArtigo;
    }
    
    
}
