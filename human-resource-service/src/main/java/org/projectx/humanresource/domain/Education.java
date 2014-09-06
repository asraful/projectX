package org.projectx.humanresource.domain;

public class Education {

	private String level;
	private String year;
	private String degree;
	private String institution;
	private String grade;
	private String cgpa;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public Education(String level, String year, String degree, String institution, String grade, String cgpa) {
		super();
		this.level = level;
		this.year = year;
		this.degree = degree;
		this.institution = institution;
		this.grade = grade;
		this.cgpa = cgpa;
	}

}
