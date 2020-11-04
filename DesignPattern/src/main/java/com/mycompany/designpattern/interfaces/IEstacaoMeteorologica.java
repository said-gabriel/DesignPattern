/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.interfaces;

/**
 *
 * @author said
 */
public interface IEstacaoMeteorologica {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notification();
}
