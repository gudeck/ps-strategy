/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.*;
import domain.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author gudeck
 */
public class ControleDominio {

    private static ControleDominio uniqueInstance = new ControleDominio();
    private GenericDAO genericDao;

    private ControleDominio() {
        dao.ConexaoHibernate.getSessionFactory();
        genericDao = new GenericDAO();
    }

    public static ControleDominio getInstance() {
        return uniqueInstance;
    }

    public void funcionarioCreate(Funcionario funcionario) {
        genericDao.create(funcionario);

    }

    public ArrayList funcionarioRead() {
        return (ArrayList) genericDao.readAll(Funcionario.class);
    }

}
