package org.KostiuchenkoD.Lab3.Controller;

import org.KostiuchenkoD.Lab3.Model.*;


public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
    public void addDepartment(Faculty faculty, Department department) {
        faculty.addDepartment(department);
    }
}