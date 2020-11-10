/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.state.main;

import br.ufes.state.models.Artigo;

/**
 *
 * @author 55289
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artigo artigo = new Artigo();
        artigo.criar();
        artigo.iniciarOuReiniciar();
        artigo.revisar();
        artigo.tentarPublicar();
        artigo.publicar();
    }

}
