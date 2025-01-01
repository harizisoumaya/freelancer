package tn.essat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tn.essat.model.Message;

@Repository
public class MessageDAOImpl implements MessageDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Message findById(int id) {
        return sessionFactory.getCurrentSession().get(Message.class, id);
    }

    @Override
    public List<Message> findBySenderId(int senderId) {
        String hql = "FROM Message WHERE sender.id = :senderId";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, Message.class)
                .setParameter("senderId", senderId)
                .list();
    }

    @Override
    public List<Message> findByRecipientId(int recipientId) {
        String hql = "FROM Message WHERE recipient.id = :recipientId";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, Message.class)
                .setParameter("recipientId", recipientId)
                .list();
    }

    @Override
    public void save(Message message) {
        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }

    @Override
    public void delete(int id) {
        Message message = findById(id);
        if (message != null) {
            sessionFactory.getCurrentSession().delete(message);
        }
    }
}
