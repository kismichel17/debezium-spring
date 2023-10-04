package ru.kismi.debeziumspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Filter implements Serializable {

    @Id
    private Long id;

    private String name;

    private String description;

    public Filter(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Filter() {
    }
}