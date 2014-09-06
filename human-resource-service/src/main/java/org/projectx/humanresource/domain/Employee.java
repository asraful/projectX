package org.projectx.humanresource.domain;

import java.util.Date;

public class Employee extends HumanResource {

	private String employeeCode;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date dateOfBirth;
	private String identificationSign;
	private String nationalIdentificationNumber;
	private String drivingLicence;
	private String birthRegistrationNumber;
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdentificationSign() {
		return identificationSign;
	}
	public void setIdentificationSign(String identificationSign) {
		this.identificationSign = identificationSign;
	}
	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}
	public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public String getBirthRegistrationNumber() {
		return birthRegistrationNumber;
	}
	public void setBirthRegistrationNumber(String birthRegistrationNumber) {
		this.birthRegistrationNumber = birthRegistrationNumber;
	}
	public Employee(String employeeCode, String firstName, String lastName, String middleName, Date dateOfBirth,
			String identificationSign, String nationalIdentificationNumber, String drivingLicence,
			String birthRegistrationNumber) {
		super();
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.dateOfBirth = dateOfBirth;
		this.identificationSign = identificationSign;
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		this.drivingLicence = drivingLicence;
		this.birthRegistrationNumber = birthRegistrationNumber;
	}
	
	
}
