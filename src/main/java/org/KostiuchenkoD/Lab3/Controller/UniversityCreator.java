package org.KostiuchenkoD.Lab3.Controller;

import org.KostiuchenkoD.Lab3.Model.*;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
    public void addFaculty(University university, Faculty faculty) {
        university.addFaculty(faculty);
    }
}