package org.KostiuchenkoD.Lab4.test;

import org.KostiuchenkoD.Lab4.JSON.JSONManager;
import org.KostiuchenkoD.Lab4.Model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit_test {
    // Тестування серіалізації і десеріалізації об'єкта University в/з JSON формату
    @Test
    public void testJsonSerialization() throws IOException {
        // Створення університету з назвою "Test University" та студентом "Ivan Petrenko"
        University oldUniversity = new University("Test University", new Student("Ivan", "Petrenko", "Ivanovych", Human.Sex.MALE, "S90"));

        // Створення факультету "Faculty of Science" та студента "Olena Sidorenko"
        Faculty faculty1 = new Faculty("Faculty of Science", new Student("Danylo", "Evans", "Mykhailovych", Human.Sex.MALE, "S91"));
        Faculty faculty2 = new Faculty("Faculty of Humanities", new Student("Sofia", "Clark", "Elizavetivna", Human.Sex.FEMALE, "S92"));

        // Створення кафедр
        Department department11 = new Department("Mathematical Modeling", new Student("Iryna", "Zakharova", "Oleksiyivna", Human.Sex.FEMALE, "S93"));
        Department department12 = new Department("Statistics and Data Analysis", new Student("Maksym", "Sergeyenko", "Hryhorovych", Human.Sex.MALE, "S94"));
        Department department21 = new Department("Optimization and Operations Research", new Student("Olena", "Kravchenko", "Vasylivna", Human.Sex.FEMALE, "S95"));
        Department department22 = new Department("Computer Modeling", new Student("Vadym", "Polyakov", "Andriyovych", Human.Sex.MALE, "S96"));

        // Створення груп
        Group group111 = new Group("CS-101", new Student("Ivan", "Petrenko", "Ivanovych", Human.Sex.MALE, "S97"));
        Group group112 = new Group("CS-102", new Student("Olena", "Sidorenko", "Ivanivna", Human.Sex.FEMALE, "S98"));
        Group group121 = new Group("CS-103", new Student("Dmytro", "Brown", "Robertovych", Human.Sex.MALE, "S99"));
        Group group122 = new Group("CS-104", new Student("Yuliia", "Johnson", "Rose", Human.Sex.FEMALE, "S100"));
        Group group211 = new Group("CS-105", new Student("Mykhailo", "Williams", "Yakovych", Human.Sex.MALE, "S101"));
        Group group212 = new Group("CS-106", new Student("Sofia", "Miller", "Annivna", Human.Sex.FEMALE, "S102"));
        Group group221 = new Group("CS-107", new Student("Danylo", "Taylor", "Thomasovych", Human.Sex.MALE, "S103"));
        Group group222 = new Group("CS-108", new Student("Olha", "Anderson", "Grace", Human.Sex.FEMALE, "S104"));

        // Додавання студентів до групи
        group111.addStudent(new Student("Charlie", "Johnson", "Davidovych", Human.Sex.MALE, "S105"));
        group111.addStudent(new Student("Yevheniia", "Williams", "Sofiivna", Human.Sex.FEMALE, "S106"));
        group112.addStudent(new Student("Leonid", "Brown", "Yakovych", Human.Sex.MALE, "S107"));
        group112.addStudent(new Student("Olha", "Jones", "Grace", Human.Sex.FEMALE, "S108"));
        group121.addStudent(new Student("Noah", "Garcia", "Henry", Human.Sex.MALE, "S109"));
        group121.addStudent(new Student("Anna", "Martinez", "Isabella", Human.Sex.FEMALE, "S110"));
        group122.addStudent(new Student("Viktor", "Davis", "Benjamin", Human.Sex.MALE, "S111"));
        group122.addStudent(new Student("Sofia", "Rodriguez", "Charlotte", Human.Sex.FEMALE, "S112"));
        group211.addStudent(new Student("Yaroslav", "Lopez", "Elijah", Human.Sex.MALE, "S113"));
        group211.addStudent(new Student("Mariia", "Hernandez", "Scarlett", Human.Sex.FEMALE, "S114"));
        group212.addStudent(new Student("Bohdan", "Gonzalez", "Lucas", Human.Sex.MALE, "S115"));
        group212.addStudent(new Student("Khrystyna", "Wilson", "Avery", Human.Sex.FEMALE, "S116"));
        group221.addStudent(new Student("Elijah", "Anderson", "Danylovych", Human.Sex.MALE, "S117"));
        group221.addStudent(new Student("Amelia", "Thomas", "Evelyn", Human.Sex.FEMALE, "S118"));
        group222.addStudent(new Student("Lucas", "Taylor", "Jack", Human.Sex.MALE, "S119"));
        group222.addStudent(new Student("Hanna", "Moore", "Lillian", Human.Sex.FEMALE, "S120"));

        // Додавання групи до кафедри, кафедри до факультету та факультету до університету
        department11.addGroup(group111);
        department11.addGroup(group112);
        department12.addGroup(group121);
        department12.addGroup(group122);
        department21.addGroup(group211);
        department21.addGroup(group212);
        department22.addGroup(group221);
        department22.addGroup(group222);

        faculty1.addDepartment(department11);
        faculty1.addDepartment(department12);
        faculty2.addDepartment(department21);
        faculty2.addDepartment(department22);

        oldUniversity.addFaculty(faculty1);
        oldUniversity.addFaculty(faculty2);

        // Збереження об'єкта oldUniversity у файл "university.json" у JSON форматі
        JSONManager.saveToFile(oldUniversity, "university.json");

        // Завантаження університету з JSON файлу в об'єкт newUniversity
        University newUniversity = JSONManager.loadFromFile("university.json");

        // Перевірка чи рівні об'єкти oldUniversity і newUniversity
        System.out.println("Are universities equal? " + oldUniversity.equals(newUniversity));

        // Використовуємо JUnit assertEquals для порівняння об'єктів
        // Якщо об'єкти однакові, тест пройде успішно
        assertEquals(oldUniversity, newUniversity);
    }
    }