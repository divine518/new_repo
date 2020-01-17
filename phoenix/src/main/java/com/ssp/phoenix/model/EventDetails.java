package com.ssp.phoenix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT_DETAILS")
public class EventDetails {

	private long event_id;
	private String organiserName;
	private String eventDate;
	private String description;
	private String venue;
	private String forCause;
	
	public EventDetails() {
		
	}
	
	public EventDetails(long event_id, String organiserName, String eventDate, String description, String venue,
			String forCause) {
		super();
		this.event_id = event_id;
		this.organiserName = organiserName;
		this.eventDate = eventDate;
		this.description = description;
		this.venue = venue;
		this.forCause = forCause;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}
	@Column(name = "ORGANISER_NAME", nullable = true)
	public String getOrganiserName() {
		return organiserName;
	}
	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}
	@Column(name = "EVENT_DATE", nullable = true)
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	@Column(name = "DESCRIPTION", nullable = true)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "VENUE", nullable = true)
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	@Column(name = "FOR_CAUSE", nullable = true)
	public String getForCause() {
		return forCause;
	}
	public void setForCause(String forCause) {
		this.forCause = forCause;
	}

	@Override
	public String toString() {
		return "EventDetails [event_id=" + event_id + ", organiserName=" + organiserName + ", eventDate=" + eventDate
				+ ", description=" + description + ", venue=" + venue + ", forCause=" + forCause + "]";
	}
	
}
