package tech.xirius.tutorial.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import tech.xirius.tutorial.filter.entities.User;

public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
}