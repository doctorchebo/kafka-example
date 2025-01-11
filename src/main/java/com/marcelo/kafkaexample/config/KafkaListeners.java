package com.marcelo.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "messagesTopic", groupId = "groupId")
    public void listener(String data){
        System.out.println("Listening to messages: " + data);
    }
}
