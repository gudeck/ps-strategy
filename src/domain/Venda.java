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
    private Double comissao;

    public Venda() {
    }

    public Venda(Funcionario funcionario, Double valor, Double comissao) {
        this.funcionario = funcionario;
        this.valor = valor;
        this.comissao = comissao;
    }

    

    public Double calculaComissao() {

        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.calculaComissao(valor);

        return comissao;

    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    
    
}
