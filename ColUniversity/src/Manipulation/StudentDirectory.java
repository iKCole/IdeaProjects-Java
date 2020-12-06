package Manipulation;

import java.util.LinkedList;
import java.util.List;

import Models.Student;
import Utilies.Create;
import Utilies.MenuOption;

public class StudentDirectory {
    private LinkedList<Student> students = new LinkedList<>();

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public LinkedList<Student> getStudent() {
        return this.students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public LinkedList<Student> viewStudents() {
        return students;
    }


}
