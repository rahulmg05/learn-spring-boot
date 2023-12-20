package com.java.spring.learn.repository;

import com.java.spring.learn.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
