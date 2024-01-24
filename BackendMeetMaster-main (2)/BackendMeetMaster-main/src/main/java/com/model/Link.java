package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String url;

		public Link() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public Link(Long id, String url) {
			super();
			this.id = id;
			this.url = url;
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}


		@Override
		public String toString() {
			return "Link [id=" + id + ", url=" + url + "]";
		}
	    
	    
}
