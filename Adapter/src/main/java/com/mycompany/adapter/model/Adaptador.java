/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.model;

import com.mycompany.adapter.interfaces.Alvo;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class Adaptador extends ClasseExistente implements Alvo {

    @Override
    public void operacao() {
        String t = metodoUtilDois("Operação Realizada!");
        JOptionPane.showMessageDialog(null, t);
    }

}
