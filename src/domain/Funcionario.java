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
public class Funcionario implements Serializable {

    public Funcionario() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer codFuncionario;
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    private Cargo cargo;

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
