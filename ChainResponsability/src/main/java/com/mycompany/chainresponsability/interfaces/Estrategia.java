/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainresponsability.interfaces;

import com.mycompany.chainresponsability.model.BaseHandler;

/**
 *
 * @author said
 */
public interface Estrategia {

    public void atacar();

    public void concluir();

    public Estrategia verifica(String codigo);
}
