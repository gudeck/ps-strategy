/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jeanglazar
 */
public class GenericDAO {

    public void create(Object obj) throws HibernateException {

        Session sessao = null;

        try {
            // Abrir a SESSÃO
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            sessao.save(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }

            throw new HibernateException(ex);
        }

    }

    public void update(Object obj) throws HibernateException {
        Session sessao = null;

        try {
            // Abrir a SESSÃO
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            sessao.update(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }

            throw new HibernateException(ex);
        }

    }

    public void delete(Object obj) throws HibernateException {
        Session sessao = null;

        try {
            // Abrir a SESSÃO
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            sessao.delete(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }

            throw new HibernateException(ex);
        }

    }

    public List readAll(Class classe) throws HibernateException {

        List lista = null;
        Session sessao = null;

        try {
            // Abrir a SESSÃO
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(classe);
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }

            throw new HibernateException(ex);
        }
        return lista;
    }

}
