package tn.essat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tn.essat.model.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Project findById(int id) {
        return sessionFactory.getCurrentSession().get(Project.class, id);
    }

    @Override
    public List<Project> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Project", Project.class).list();
    }

    @Override
    public void save(Project project) {
        sessionFactory.getCurrentSession().saveOrUpdate(project);
    }

    @Override
    public void update(Project project) {
        sessionFactory.getCurrentSession().update(project);
    }

    @Override
    public void delete(int id) {
        Project project = findById(id);
        if (project != null) {
            sessionFactory.getCurrentSession().delete(project);
        }
    }
}
