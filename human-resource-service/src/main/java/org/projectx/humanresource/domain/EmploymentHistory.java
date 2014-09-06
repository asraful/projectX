package org.projectx.humanresource.domain;

import java.util.Date;

public class EmploymentHistory {

	private String employerName;
	private Date onboardingDate;
	private Date offBoardingDate;

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Date getOnboardingDate() {
		return onboardingDate;
	}

	public void setOnboardingDate(Date onboardingDate) {
		this.onboardingDate = onboardingDate;
	}

	public Date getOffBoardingDate() {
		return offBoardingDate;
	}

	public void setOffBoardingDate(Date offBoardingDate) {
		this.offBoardingDate = offBoardingDate;
	}

	public EmploymentHistory(String employerName, Date onboardingDate, Date offBoardingDate) {
		super();
		this.employerName = employerName;
		this.onboardingDate = onboardingDate;
		this.offBoardingDate = offBoardingDate;
	}

}
