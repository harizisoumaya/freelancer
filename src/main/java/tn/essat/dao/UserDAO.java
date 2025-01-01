package tn.essat.dao;

import java.util.List;

import tn.essat.model.User;

public interface UserDAO {
    User findById(int id);
    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(int id);
}
