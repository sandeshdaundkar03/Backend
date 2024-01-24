package com.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CreateMeeting {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	 	private String title;
	    private LocalDate date;
	    private LocalTime time;
		
	    @OneToOne(cascade = CascadeType.ALL) // Use CascadeType.ALL for bi-directional relationships
	    private Link link;

		public CreateMeeting() {
			super();
			// TODO Auto-generated constructor stub
		}

		public CreateMeeting(int id, String title, LocalDate date, LocalTime time, Link link) {
			super();
			this.id = id;
			this.title = title;
			this.date = date;
			this.time = time;
			this.link = link;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public LocalTime getTime() {
			return time;
		}

		public void setTime(LocalTime time) {
			this.time = time;
		}

		public Link getLink() {
			return link;
		}

		public void setLink(Link link) {
			this.link = link;
		}

		@Override
		public String toString() {
			return "CreateMeeting [id=" + id + ", title=" + title + ", date=" + date + ", time=" + time + ", link="
					+ link + "]";
		}
	    
	    
	    
}
