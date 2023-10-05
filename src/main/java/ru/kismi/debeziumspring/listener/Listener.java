package ru.kismi.debeziumspring.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Slf4j
//@Component
//@RequiredArgsConstructor
//@KafkaListener(topics = "postgres.public.filter", groupId = "consumer_test_group")
//public class Listener {
//
//    private final ObjectMapper objectMapper;
//
//    @KafkaHandler
//    @SneakyThrows
//    public void handleMessage(Object message) {
//        log.info("================ new event ============\n\n");
//        log.info(objectMapper.writeValueAsString(message));
//    }
//}