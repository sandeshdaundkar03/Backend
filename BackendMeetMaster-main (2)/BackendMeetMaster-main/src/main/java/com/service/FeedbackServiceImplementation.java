package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Feedback;
import com.repository.FeedbackRepository;

@Service
public class FeedbackServiceImplementation implements FeedbackServiceInterface{

	@Autowired
	FeedbackRepository feedRepo;
	
	@Override
	public Feedback saveFeedback(Feedback feedback) {
		return feedRepo.save(feedback);
	}

}
