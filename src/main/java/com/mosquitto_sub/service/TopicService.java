package com.mosquitto_sub.service;

import com.mosquitto_sub.entity.TopicEntity;
import com.mosquitto_sub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public void insertTopic (TopicEntity topic) {
        topicRepository.save(topic);
    }

}
