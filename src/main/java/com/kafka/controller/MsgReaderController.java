package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.Producer;

@RestController

@RequestMapping("/rest/api")
public class MsgReaderController {

	@Autowired
	Producer producer;

	@GetMapping("/readmsg")
	public void readMessage(@RequestParam("messge") String name) {
		
		producer.sendMsgToTopic(name);
		
	}
}
