/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainresponsability.model;

import com.mycompany.chainresponsability.interfaces.Estrategia;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author said
 */
public abstract class BaseHandler {

    private Estrategia nextHandler;

    public BaseHandler(Estrategia next) {
        this.nextHandler = next;
    }

    public Estrategia getNextHandler() {
        return this.nextHandler;
    }

    public void setNextHandler(Estrategia nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Estrategia next(String cod);

}
