package org.KostiuchenkoD.Lab4.Controller;

import org.KostiuchenkoD.Lab4.Model.Department;
import org.KostiuchenkoD.Lab4.Model.Faculty;
import org.KostiuchenkoD.Lab4.Model.Human;


public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
    public void addDepartment(Faculty faculty, Department department) {
        faculty.addDepartment(department);
    }
}