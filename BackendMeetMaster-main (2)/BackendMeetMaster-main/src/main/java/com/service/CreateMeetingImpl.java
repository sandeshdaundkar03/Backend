package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.CreateMeeting;
import com.repository.CreateMeetingRepository;

@Service
public class CreateMeetingImpl implements CreateMeetingInterface {
	
	@Autowired
	CreateMeetingRepository createMeet;
	
	@Override
	public CreateMeeting saveMeeting(CreateMeeting create) {
		// TODO Auto-generated method stub
		return createMeet.save(create);
	}

	@Override
	public List<CreateMeeting> getAllMeetings() {
		// TODO Auto-generated method stub
		return createMeet.findAll();
	}

	
	

}
