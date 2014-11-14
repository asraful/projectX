package org.projectx.studentinformationservice.domain;

/**
 * Created by Jakir Hosen Khan on 11/12/2014.
 */
public class FamilyInformation {
    private String fatherName;
    private String motherName;

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
}
