/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author 2017122760013
 */
public enum Cargo implements Comissao {

    ESTAGIARIO {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.0;
        }
    },
    VENDEDOR {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.05 ;
        }
    },
    GERENTE {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.10;
        }
    };

}
