package com.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class roomIdController {

	
	  @GetMapping("/generate")
	    public String generateRoomId() {
	        return generateRandomRoomId();
	    }

	    private String generateRandomRoomId() {
	        // Generate a unique room ID (you can customize this logic)
	        return UUID.randomUUID().toString().substring(0, 8);
	    }
}
