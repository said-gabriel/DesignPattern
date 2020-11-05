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
public class Diplomacia extends BaseHandler implements Estrategia {

    private final String codigo = "dm";

    public Diplomacia(Estrategia next) {
        super(next);
    }

    @Override
    public void atacar() {
        JOptionPane.showMessageDialog(null, "Enviar mensagem diplomática.");
    }

    @Override
    public void concluir() {
        JOptionPane.showMessageDialog(null, "Reunião realizada com sucesso. Situação resolvida!");
    }

    @Override
    public Estrategia verifica(String codigo) {
        if (this.codigo.equals(codigo)) {
            return this;
        } else {
            return (Estrategia) next(codigo);
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
        return getNextHandler().verifica(codigo);
    }

}
