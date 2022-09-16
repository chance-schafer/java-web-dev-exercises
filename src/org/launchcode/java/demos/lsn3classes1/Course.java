package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    public String teacher;
    public int credits;
    public String subject;
    public String courseTitle;
    public ArrayList<String> enrolledStudents;

    public Course(String teacher, int credits, String subject, String courseTitle) {
        this.teacher = teacher;
        this.credits = credits;
        this.subject = subject;
        this.courseTitle = courseTitle;

    }

    public void addEnrolledStudent(String name) {
        String student = name;
        enrolledStudents.add(student);

    }

    public void getEnrolledStudentList() {
        for(int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println(enrolledStudents.get(i));
        }
    }
}
