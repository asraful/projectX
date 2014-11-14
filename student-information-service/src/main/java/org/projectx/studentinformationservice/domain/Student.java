package org.projectx.studentinformationservice.domain;

import java.util.Date;


public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String birthIdentificationId;
    private String contact;


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBirthIdentificationId(String birthIdentificationId) {
        this.birthIdentificationId = birthIdentificationId;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBirthIdentificationId() {
        return birthIdentificationId;
    }

    public String getContact() {
        return contact;
    }
}
