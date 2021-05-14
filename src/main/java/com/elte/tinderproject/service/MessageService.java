package com.elte.tinderproject.service;

import com.elte.tinderproject.model.Message;
import com.elte.tinderproject.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepo;

    @Autowired
    public MessageService(MessageRepository messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Iterable<Message> get_all() {
        return messageRepo.findAll();
    }

    public Message get_one(long id) {
        return messageRepo.findById(id).orElse(null);
    }

    public void put_one(Message message) {
        messageRepo.save(message);
    }

    public void delete_one(long id) {
        messageRepo.deleteById(id);
    }

}
