package org.projectx.humanresource.domain;

import java.util.Date;

public class WorkShift {

	private Date shiftStartTime;
	private Date shiftEndTime;
	private String shiftName;

	public Date getShiftStartTime() {
		return shiftStartTime;
	}

	public void setShiftStartTime(Date shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}

	public Date getShiftEndTime() {
		return shiftEndTime;
	}

	public void setShiftEndTime(Date shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public WorkShift(Date shiftStartTime, Date shiftEndTime, String shiftName) {
		super();
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
		this.shiftName = shiftName;
	}

}
