package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String, String> kafkatemolate;
	
	
	public void sendMsgToTopic(String str) {
		
		kafkatemolate.send("topic-1",str);
		
	}
	
}
