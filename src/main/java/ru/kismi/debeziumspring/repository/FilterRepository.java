package ru.kismi.debeziumspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kismi.debeziumspring.entity.Filter;

@Repository
public interface FilterRepository extends JpaRepository<Filter, Long> {
}
