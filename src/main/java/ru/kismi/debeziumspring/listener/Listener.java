package ru.kismi.debeziumspring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@KafkaListener(topics = "postgres.public.filter", groupId = "consumer_test_group")
public class Listener {

    @KafkaHandler
    public void handleMessage(String message) {
        log.info("================ new event ============\n\n");
        log.info(message);
    }
}