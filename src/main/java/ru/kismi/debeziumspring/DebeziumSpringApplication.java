package ru.kismi.debeziumspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kismi.debeziumspring.entity.Filter;
import ru.kismi.debeziumspring.repository.FilterRepository;

import java.util.List;

@SpringBootApplication
public class DebeziumSpringApplication implements CommandLineRunner {

    @Autowired
    private FilterRepository filterRepository;

    public static void main(String[] args) {
        SpringApplication.run(DebeziumSpringApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var filters = List.of(
                new Filter(1L, "filter1", "filter1")
        );

        filterRepository.saveAll(filters);
    }
}