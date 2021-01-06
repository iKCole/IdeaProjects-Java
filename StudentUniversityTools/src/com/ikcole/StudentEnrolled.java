package com.ikcole;

import java.util.HashMap;

public class StudentEnrolled {
    private HashMap<Student, Enrollment> Enrolled;

    public HashMap<Student, Enrollment> getEnrolled() {
        return Enrolled;
    }

    public void setEnrolled(HashMap<Student, Enrollment> enrolled) {
        Enrolled = enrolled;
    }
}
