package org.projectx.studentinformationservice.service;


import org.projectx.studentinformationservice.domain.Student;

import java.util.List;

/**
 * Created by Asraful on 10/30/2014.
 */
public interface StudentInformationService {

    public Student findStudentByName(String studentName);

    public Student findStudentById(String studentId);

    public Student findAllStudent();

    public List<Student> findStudentsBySubjectSelection(String subjectCode);

    public Student findStudentByCourseName();

    public Student findStudentByCourse(String courseCode);

    public List<Student> findStudentsByCourseName(String courseName);

    public List<Student> findStudentsByCourse(String courseCode);

    public String saveStudentDetail();

    public boolean deleteStudentDetail(String studentId);
}
