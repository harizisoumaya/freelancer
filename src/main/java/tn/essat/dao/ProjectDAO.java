package tn.essat.dao;

import java.util.List;

import tn.essat.model.Project;

public interface ProjectDAO {
    Project findById(int id);
    List<Project> findAll();
    void save(Project project);
    void update(Project project);
    void delete(int id);
}
