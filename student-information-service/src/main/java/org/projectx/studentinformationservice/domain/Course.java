package org.projectx.studentinformationservice.domain;

/**
 * Created by Jakir Hosen Khan on 11/11/2014.
 */
public class Course {
    private String courseCode;
    private String courseCredit;
    private String subjects;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public String getSubjects() {
        return subjects;
    }
}
