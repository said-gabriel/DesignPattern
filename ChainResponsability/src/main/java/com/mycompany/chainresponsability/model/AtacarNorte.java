/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainresponsability.model;

import com.mycompany.chainresponsability.interfaces.Estrategia;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class AtacarNorte extends BaseHandler implements Estrategia {

    private final String codigo = "an";

    public AtacarNorte(Estrategia next) {
        super(next);
    }

    @Override
    public void atacar() {
        JOptionPane.showMessageDialog(null, "Reunir tropas e atacar pelo norte!");
    }

    @Override
    public void concluir() {
        JOptionPane.showMessageDialog(null, "Ataque pelo norte feito!");
    }

    @Override
    public Estrategia verifica(String codigo) {
        if (this.codigo.equals(codigo)) {
            return this;
        } else {
            return next(codigo);
        }
    }

    @Override
    public Estrategia next(String cod) {
        if (getNextHandler() == null) {
            try {
                throw new Exception("Não existe próximo!");
            } catch (Exception ex) {
                Logger.getLogger(BaseHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (Estrategia) getNextHandler().verifica(cod);
    }
}
