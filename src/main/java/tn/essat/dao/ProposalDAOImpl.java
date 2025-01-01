package tn.essat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tn.essat.controller.ProposalDAO;
import tn.essat.model.Proposal;

@Repository
public class ProposalDAOImpl implements ProposalDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Proposal findById(int id) {
        return sessionFactory.getCurrentSession().get(Proposal.class, id);
    }

    @Override
    public List<Proposal> findByProjectId(int projectId) {
        String hql = "FROM Proposal WHERE project.id = :projectId";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, Proposal.class)
                .setParameter("projectId", projectId)
                .list();
    }

    @Override
    public List<Proposal> findByFreelancerId(int freelancerId) {
        String hql = "FROM Proposal WHERE freelancer.id = :freelancerId";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, Proposal.class)
                .setParameter("freelancerId", freelancerId)
                .list();
    }

    @Override
    public void save(Proposal proposal) {
        sessionFactory.getCurrentSession().saveOrUpdate(proposal);
    }

    @Override
    public void update(Proposal proposal) {
        sessionFactory.getCurrentSession().update(proposal);
    }

    @Override
    public void delete(int id) {
        Proposal proposal = findById(id);
        if (proposal != null) {
            sessionFactory.getCurrentSession().delete(proposal);
        }
    }
}
