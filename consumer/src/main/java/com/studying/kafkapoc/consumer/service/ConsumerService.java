package com.studying.kafkapoc.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerService {

    private final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "${topic.studying.kafka.docker}", groupId = "group_id")
    public void consumer(String message) throws IOException {
        LOGGER.info(String.format("-- CONSUMED MESSAGE: %s", message));

    }


}
