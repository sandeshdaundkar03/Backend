package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Link;
import com.repository.LinkRepository;

@Service
public class LinkServiceImple implements LinkInterface{

	
	@Autowired
	LinkRepository linkRepo;
	
	@Override
	public Link saveLink(Link link) {
		// TODO Auto-generated method stub
		return linkRepo.save(link);
	}

}
