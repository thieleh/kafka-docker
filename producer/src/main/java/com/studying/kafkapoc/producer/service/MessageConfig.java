package com.studying.kafkapoc.producer.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MessageConfig {

    @Value("${topic.studying.kafka.docker}")
    public String topicName;

    @Bean
    public NewTopic createTopicKafkaDocker() {
        return TopicBuilder.name(topicName).partitions(3).replicas(1).build();
    }
}
