package org.KostiuchenkoD.Lab3.Controller;

import org.KostiuchenkoD.Lab3.Model.*;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Human.Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}
