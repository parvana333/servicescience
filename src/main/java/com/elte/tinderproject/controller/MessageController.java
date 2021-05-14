package com.elte.tinderproject.controller;

import com.elte.tinderproject.model.Message;
import com.elte.tinderproject.service.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public Iterable<Message> get_all() {
        return messageService.get_all();
    }

    @GetMapping("/messages/{id}")
    public Message get_one(@PathVariable("id") long id) {
        return messageService.get_one(id);
    }

    @PutMapping("/messages")
    public void put_one(@RequestBody Message message) {
        System.out.println(message);
        messageService.put_one(message);
    }

    @DeleteMapping("/messages/{id}")
    public void delete_one(@PathVariable("id") long id) {
        messageService.delete_one(id);
    }
}
