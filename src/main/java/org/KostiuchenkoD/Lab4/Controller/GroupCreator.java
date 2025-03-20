package org.KostiuchenkoD.Lab4.Controller;

import org.KostiuchenkoD.Lab4.Model.Group;
import org.KostiuchenkoD.Lab4.Model.Human;
import org.KostiuchenkoD.Lab4.Model.Student;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
    public void addStudent(Group group, Student student) {
        group.addStudent(student);
    }
}