package com.kafka.service;

import org.springframework.context.event.EventListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "topic-1", groupId = "consumer-1-group")
	public void readmessage(String message) {

		System.out.println(message);
	}

}
