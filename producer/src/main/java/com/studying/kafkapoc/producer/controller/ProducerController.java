package com.studying.kafkapoc.producer.controller;

import com.studying.kafkapoc.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/message")
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping(value = "/send")
    public void sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
    }
}
