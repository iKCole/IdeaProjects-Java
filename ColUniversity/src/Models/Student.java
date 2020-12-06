package Models;

import java.util.LinkedList;
import java.util.List;
import Utilies.Create;

public class Student {
//    private final int ID;
    private String lastName;
    private String firstMidName;
    private List<Account> studentAccount;
    private final int student_id;
    private boolean pending;

//    public int getID() {
//        return ID;
//    }

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

    public List<Account> getStudentAccount() { return studentAccount; }

    public int getStudent_id() { return student_id; }

    public boolean isPending() { return pending; }

    public Student(int student_id, String firstMidName, String lastName, List<Account> studentAccount) {
        this.student_id = student_id;
        this.firstMidName = firstMidName;
        this.lastName = lastName;
        this.studentAccount = studentAccount;
    }

}
