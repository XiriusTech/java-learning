package tech.xirius.tutorial.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import tech.xirius.tutorial.filter.entities.Person;

public interface PersonRepository extends JpaSpecificationExecutor<Person>, JpaRepository<Person, Long> {
}