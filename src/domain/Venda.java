/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author 2017122760013
 */
@Entity
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codVenda;

    @ManyToOne(targetEntity = Funcionario.class)
    private Funcionario funcionario;
    private Double valor;

    public Venda() {
    }

    public Venda(Funcionario funcionario, double valor) {
        this.funcionario = funcionario;
        this.valor = valor;
    }

    public Double calculaComissao() {

        double comissao = 0.0;

        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.calculaComissao(valor);

        return comissao;

    }

}
