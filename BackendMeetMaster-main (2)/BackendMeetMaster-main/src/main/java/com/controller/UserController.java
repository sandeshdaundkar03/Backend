package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.CreateMeeting;
import com.model.Feedback;
import com.model.Link;
import com.model.User;
import com.service.CreateMeetingInterface;
import com.service.FeedbackServiceInterface;
import com.service.LinkInterface;
import com.service.UserServiceInterface;


@RestController
public class UserController {
	
	
	@Autowired
	UserServiceInterface userServ;
	
	@PostMapping("/register")
	@CrossOrigin(origins = "http://localhost:4200/")

	public User RegisterUser(@RequestBody User user) throws Exception {
		
		String Temp=user.getEmailid();
		if(Temp!=null && !"" .equals(Temp))
		{
			User obj=userServ.FindByEmailid(Temp);
			
			if(obj!=null)
			{
				throw new Exception("User with " +Temp+ "already exists ");
			}
		}
		return userServ.RegisterUser(user);
		
		
	
	
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200/")
	public User FindByEmailidAndPassword(@RequestBody User user) throws Exception {
	
		String TempEmail=user.getEmailid();
		String TempPass=user.getPassword();
		
		User userobj=null;
		if(TempEmail!=null && TempPass!=null)
		{
			userobj=userServ.FindByEmailidAndPassword(TempEmail, TempPass);
			
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	
	
	
	@Autowired
	CreateMeetingInterface meetServ;
	
	@PostMapping("/addMeeting")
	@CrossOrigin(origins = "http://localhost:4200/")
	public CreateMeeting saveMeeting(@RequestBody CreateMeeting create) {
	return meetServ.saveMeeting(create);
	}
	
	@GetMapping("/getAllMeeting")
	@CrossOrigin(origins = "http://localhost:4200/")
	public List<CreateMeeting> getAllMeetings() {
		return meetServ.getAllMeetings();
	}
	
	
	
	@Autowired
	FeedbackServiceInterface feedServ;
	
	@PostMapping("/saveFeed")
	@CrossOrigin(origins = "http://localhost:4200/")
	public Feedback saveFeedback(@RequestBody  Feedback feedback) {
	return feedServ.saveFeedback(feedback);
	
	}
	
	
	@Autowired
	LinkInterface linkServ;
	
	@PostMapping("/saveLink")	
	@CrossOrigin(origins = "http://localhost:4200/")
	public Link saveLink(Link link) {
	return linkServ.saveLink(link);
	}
	
}
