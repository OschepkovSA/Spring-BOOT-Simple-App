package ru.company.repository;

import org.springframework.data.repository.CrudRepository;
import ru.company.entity.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
