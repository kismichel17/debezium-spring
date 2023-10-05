package ru.kismi.debeziumspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kismi.debeziumspring.entity.Filter;
import ru.kismi.debeziumspring.repository.FilterRepository;

import java.util.Random;
import java.util.UUID;

@Slf4j
@RestController
public class FilterController {

    private final FilterRepository filterRepository;

    @Autowired
    public FilterController(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @GetMapping("/1")
    public void changeFilterDescription() {
        log.info("Change filter");
        var filter = filterRepository.findAll().get(0);
        filter.setDescription("new description-" + UUID.randomUUID());
        filterRepository.save(filter);
    }

    @GetMapping("/2")
    public void changeFilterName() {
        log.info("Change filter");
        var filter = filterRepository.findAll().get(0);
        filter.setName("new name-" + UUID.randomUUID());
        filterRepository.save(filter);
    }

    @GetMapping("/3")
    public void deleteFilter() {
        log.info("Change filter");
        var filter = filterRepository.findAll().get(0);
        filterRepository.delete(filter);
    }

    @GetMapping("/4")
    public void insertNewFilter() {
        log.info("Change filter");
        var filter = new Filter(new Random().nextLong(), UUID.randomUUID().toString(), UUID.randomUUID().toString());
        filterRepository.save(filter);
    }
}