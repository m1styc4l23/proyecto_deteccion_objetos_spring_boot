package com.mosquitto_sub.repository;

import com.mosquitto_sub.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<TopicEntity, Integer> {


}
