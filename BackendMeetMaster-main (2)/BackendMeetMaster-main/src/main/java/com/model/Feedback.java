package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		String name;
		String email;
		
		@Column(name="phone"  ,length = 20 )
		long phone;
		
		@Column(length = 1024 )
		String message;
		
		
		public Feedback() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Feedback(int id, String name, String email, long phone, String message) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.message = message;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		@Override
		public String toString() {
			return "Feedback [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", message="
					+ message + "]";
		}
		
		
	
		
		
		
		
		
}
