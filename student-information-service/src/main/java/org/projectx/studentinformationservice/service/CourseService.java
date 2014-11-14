package org.projectx.studentinformationservice.service;

import org.projectx.studentinformationservice.domain.Course;

/**
 * Created by Asraful on 11/1/2014.
 */
public interface CourseService {


    public Course findCourseByCode(String courseCode);

    public Course findCourseByName(String courseName);






}
