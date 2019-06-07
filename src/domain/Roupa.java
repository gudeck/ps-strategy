/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author guzuc
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Roupa implements Serializable {

    public Roupa() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer codRoupa;
    protected Double valorAluguel;
    protected String nomeProduto;

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Roupa getRoupa() {
        return null;
    }

    public void setRoupa(Roupa roupa) {

    }

}
