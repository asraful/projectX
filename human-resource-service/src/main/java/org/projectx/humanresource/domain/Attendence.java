package org.projectx.humanresource.domain;

import java.util.Date;

public class Attendence {

	private Date inTime;
	private Date outTime;
	private boolean isPresent;

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public Attendence(Date inTime, Date outTime, boolean isPresent) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
		this.isPresent = isPresent;
	}

}
