package com.java.spring.learn.services;

import com.java.spring.learn.models.Topic;
import com.java.spring.learn.repository.TopicRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        final List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public Topic getTopic(@NonNull final String id) {
        return topicRepository.findById(id).get();
    }

    public void addTopic(@NonNull final Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(@NonNull final String id) {
        topicRepository.deleteById(id);
    }

    public void updateTopic(@NonNull final Topic topic) {
        topicRepository.save(topic);
    }
}
