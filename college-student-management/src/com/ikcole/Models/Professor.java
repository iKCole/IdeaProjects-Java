package com.ikcole.Models;

public class Professor {
    private Integer professorId;
    private String professorName;
    private String professorEmail;
    private String professorPassword;

    public Professor() {}

    public Professor(int pId, String pName, String pEmail, String pPassword) {
        this.professorId = pId;
        this.professorName = pName;
        this.professorEmail = pEmail;
        this.professorPassword = pPassword;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorPassword() {
        return professorPassword;
    }

    public void setProfessorPassword(String professorPassword) {
        this.professorPassword = professorPassword;
    }

    @Override
    public String toString() {
        return ">> Info you have entered <<\n\tProfessor ID: " + professorId + "\n\tProfessor Name: " + professorName + "\n" + "\tProfessor Email: " + professorEmail + "\n\tPassword: " + professorPassword;
    }
}
