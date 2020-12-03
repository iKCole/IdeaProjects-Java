package Models;

import javax.print.attribute.standard.DateTimeAtProcessing;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student extends Enrollment {
    private int ID;
    private String lastName;
    private String firstMidName;
    private LocalDate enrollmentDate;

    private List<Enrollment> enrollments;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstMidName() {
        return firstMidName;
    }

    public void setFirstMidName(String firstMidName) {
        this.firstMidName = firstMidName;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public Student(String firstMidName, String lastName) {
        this.firstMidName = firstMidName;
        this.lastName = lastName;
        this.enrollmentDate = LocalDate.now();
    }

    public void displayInfo() {
        System.out.println(firstMidName + " " + lastName + "......." + enrollmentDate);
    }


}
