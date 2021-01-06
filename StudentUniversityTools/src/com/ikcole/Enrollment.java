package com.ikcole;

import java.util.HashMap;
import java.util.List;

public class Enrollment {
    private int courseNumber;
    private String courseName;
    private String courseDaysTime;
    private int courseCredit;

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDaysTime() {
        return courseDaysTime;
    }

    public void setCourseDaysTime(String courseDaysTime) {
        this.courseDaysTime = courseDaysTime;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }
}
