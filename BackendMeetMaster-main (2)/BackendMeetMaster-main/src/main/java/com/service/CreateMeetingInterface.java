package com.service;

import java.util.List;

import com.model.CreateMeeting;


public interface CreateMeetingInterface {

	
	public CreateMeeting saveMeeting(CreateMeeting create);
	public List<CreateMeeting> getAllMeetings();
}