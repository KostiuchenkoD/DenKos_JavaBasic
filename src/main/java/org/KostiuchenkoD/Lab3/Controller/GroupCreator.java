package org.KostiuchenkoD.Lab3.Controller;

import org.KostiuchenkoD.Lab3.Model.*;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
    public void addStudent(Group group, Student student) {
        group.addStudent(student);
    }
}