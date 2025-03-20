package org.KostiuchenkoD.Lab3;

import org.KostiuchenkoD.Lab3.Controller.*;
import org.KostiuchenkoD.Lab3.Model.*;

public class Run {
    public static void Main() {
        University university = createTypicalUniversity();
        System.out.println(university);
    }

    public static University createTypicalUniversity() {
        // Створення людей
        HumanCreator humanCreator = new HumanCreator();
        Human rector = humanCreator.createHuman("Денис", "Костюченко", "Олександрович", Human.Sex.MALE);
        Human dean = humanCreator.createHuman("Олена", "Сидорова", "Олексіївна", Human.Sex.FEMALE);
        Human departmentHead = humanCreator.createHuman("Михайло", "Коваленко", "Михайлович", Human.Sex.MALE);
        Human groupLeader = humanCreator.createHuman("Анна", "Іванова", "Петрівна", Human.Sex.FEMALE);

        // Створення студентів
        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("Олег", "Коваль", "Олегович", Human.Sex.MALE);
        Student student2 = studentCreator.createStudent("Марія", "Шевченко", "Ігорівна", Human.Sex.FEMALE);

        // Створення групи
        GroupCreator groupCreator = new GroupCreator();
        Group group = groupCreator.createGroup("Група 123-21-1", groupLeader);
        group.addStudent(student1);
        group.addStudent(student2);

        // Створення кафедри
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.createDepartment("Кафедра інформаційних технологій та комп'ютерної інженерії", departmentHead);
        department.addGroup(group);

        // Створення факультету
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createFaculty("Факультет інформаційних технологій", dean);
        faculty.addDepartment(department);

        // Створення університету
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Національний технічний університет «Дніпровська політехніка»", rector);
        university.addFaculty(faculty);

        return university;
    }
}
