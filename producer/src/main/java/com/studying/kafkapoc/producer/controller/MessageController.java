package com.studying.kafkapoc.producer.controller;

import com.studying.kafkapoc.producer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/message")
public class MessageController {

    private final MessageService messageService;

    @PostMapping(value = "/send")
    public void sendMessage(@RequestBody String message) {
        messageService.sendMessage(message);
    }
}
