package tn.essat.dao;

import java.util.List;

import tn.essat.model.Proposal;

public interface ProposalDAO {
    Proposal findById(int id);
    List<Proposal> findByProjectId(int projectId);
    List<Proposal> findByFreelancerId(int freelancerId);
    void save(Proposal proposal);
    void update(Proposal proposal);
    void delete(int id);
}
