package tn.essat.dao;

import java.util.List;

import tn.essat.model.Profil;

public interface ProfilDAO {
    Profil findById(int id);
    List<Profil> findAll();
    void save(Profil profil);
    void update(Profil profil);
    void delete(int id);
}
