/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.model;

import com.mycompany.designpattern.interfaces.IEstacaoMeteorologica;
import com.mycompany.designpattern.interfaces.Observer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author said
 */
public class EstacaoMeteorologica implements IEstacaoMeteorologica {

    private ArrayList<Observer> observers;
    private double temperatura;
    private double pressao;
    private double umidade;

    public EstacaoMeteorologica() {
        this.observers = new ArrayList<>();
    }

    public void atualizarDados(double t, double p, double u) {
        this.temperatura = t;
        this.pressao = p;
        this.umidade = u;
        notification();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {
            observers.remove(observer);
        } else {
            JOptionPane.showMessageDialog(null, "Objeto não encontrado!");
        }
    }

    @Override
    public void notification() {
        for (int i = 0; i<observers.size();i++) {
            observers.get(i).update();
        }
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
    
}
