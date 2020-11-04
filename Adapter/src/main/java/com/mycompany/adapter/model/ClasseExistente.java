/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.model;

import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
class ClasseExistente {

    public void metodoUtilUm(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public String metodoUtilDois(String texto) {
        return texto.toUpperCase();
    }
}
