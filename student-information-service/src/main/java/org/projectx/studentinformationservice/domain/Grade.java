package org.projectx.studentinformationservice.domain;

/**
 * Created by Jakir Hosen Khan on 11/13/2014.
 */
public class Grade {
    private String gradeName;
    private double gradePoint;
    private float marksUpperLimit;
    private float marksLowerLimit;

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public void setMarksUpperLimit(float marksUpperLimit) {
        this.marksUpperLimit = marksUpperLimit;
    }

    public void setMarksLowerLimit(float marksLowerLimit) {
        this.marksLowerLimit = marksLowerLimit;
    }

    public String getGradeName() {
        return gradeName;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public float getMarksUpperLimit() {
        return marksUpperLimit;
    }

    public float getMarksLowerLimit() {
        return marksLowerLimit;
    }
}
