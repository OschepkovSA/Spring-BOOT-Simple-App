package ru.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.company.entity.User;

public interface UserRepositrory extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
