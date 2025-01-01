package tn.essat.dao;

import java.util.List;

import tn.essat.model.Message;

public interface MessageDAO {
    Message findById(int id);
    List<Message> findBySenderId(int senderId);
    List<Message> findByRecipientId(int recipientId);
    void save(Message message);
    void delete(int id);
}
