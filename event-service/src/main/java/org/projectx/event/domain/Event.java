package org.projectx.event.domain;

import java.util.Date;

public class Event {
	private String eventCode;
	private String eventName;
	private String eventDescription;
	private String eventOrganizar;
	private Date eventDate;
	private Date eventStartTime;
	private Date eventEndTime;
	private String eventLocation;

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventOrganizar() {
		return eventOrganizar;
	}

	public void setEventOrganizar(String eventOrganizar) {
		this.eventOrganizar = eventOrganizar;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Date getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(Date eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public Date getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(Date eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public Event(String eventCode, String eventName, String eventDescription, String eventOrganizar, Date eventDate,
			Date eventStartTime, Date eventEndTime, String eventLocation) {
		super();
		this.eventCode = eventCode;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventOrganizar = eventOrganizar;
		this.eventDate = eventDate;
		this.eventStartTime = eventStartTime;
		this.eventEndTime = eventEndTime;
		this.eventLocation = eventLocation;
	}

}
