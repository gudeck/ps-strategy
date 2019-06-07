/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author guzuc
 */
@Entity
public abstract class Incrementos extends Roupa {

    public Incrementos() {
    }

    @ManyToOne(targetEntity = Roupa.class)
    protected Roupa roupa;

    public Incrementos(Roupa vestido) {
        this.roupa = vestido;
    }

    @Override
    public String getNomeProduto() {
        return roupa.getNomeProduto() + " + " + nomeProduto + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getValorAluguel() {
        return roupa.getValorAluguel() + valorAluguel; //To change body of generated methods, choose Tools | Templates.
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

}
