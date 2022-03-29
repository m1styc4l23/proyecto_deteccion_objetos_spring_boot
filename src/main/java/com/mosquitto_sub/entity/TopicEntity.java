package com.mosquitto_sub.entity;

import javax.persistence.*;

@Entity
@Table(name = "mqtt")
public class TopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String topic;

    public TopicEntity(String topic) {
        this.topic = topic;
    }

    public TopicEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
