package ru.kismi.debeziumspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kismi.debeziumspring.repository.FilterRepository;

@RestController
public class FilterController {

    private final FilterRepository filterRepository;

    @Autowired
    public FilterController(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @GetMapping
    public void fillFilters() {

    }
}
