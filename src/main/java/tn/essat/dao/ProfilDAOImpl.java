package tn.essat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tn.essat.model.Profil;

@Repository
public class ProfilDAOImpl implements ProfilDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Profil findById(int id) {
        return sessionFactory.getCurrentSession().get(Profil.class, id);
    }

    @Override
    public List<Profil> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Profil", Profil.class).list();
    }

    @Override
    public void save(Profil profil) {
        sessionFactory.getCurrentSession().saveOrUpdate(profil);
    }

    @Override
    public void update(Profil profil) {
        sessionFactory.getCurrentSession().update(profil);
    }

    @Override
    public void delete(int id) {
        Profil profil = findById(id);
        if (profil != null) {
            sessionFactory.getCurrentSession().delete(profil);
        }
    }
}
