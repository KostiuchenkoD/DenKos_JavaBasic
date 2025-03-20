package org.KostiuchenkoD.Lab4.Controller;

import org.KostiuchenkoD.Lab4.Model.Department;
import org.KostiuchenkoD.Lab4.Model.Group;
import org.KostiuchenkoD.Lab4.Model.Human;


public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
    public void addGroup(Department department, Group group) {
        department.addGroup(group);
    }
}