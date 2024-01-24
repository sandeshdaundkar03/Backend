package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.CreateMeeting;

@Repository
public interface CreateMeetingRepository extends JpaRepository<CreateMeeting,Integer>{
 
}
