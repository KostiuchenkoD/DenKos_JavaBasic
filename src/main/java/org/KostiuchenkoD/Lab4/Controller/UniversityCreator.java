package org.KostiuchenkoD.Lab4.Controller;

import org.KostiuchenkoD.Lab4.Model.Faculty;
import org.KostiuchenkoD.Lab4.Model.Human;
import org.KostiuchenkoD.Lab4.Model.University;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
    public void addFaculty(University university, Faculty faculty) {
        university.addFaculty(faculty);
    }
}