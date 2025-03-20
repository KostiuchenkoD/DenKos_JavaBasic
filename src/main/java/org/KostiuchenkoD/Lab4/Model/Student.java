package org.KostiuchenkoD.Lab4.Model;

import java.util.Objects;

public class Student extends Human {
    private String studentId;

    public Student(String firstName, String lastName, String patronymic, Sex sex, String studentId){
        super(firstName, lastName, patronymic, sex);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId);
    }
}
