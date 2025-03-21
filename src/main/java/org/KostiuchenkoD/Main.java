package org.KostiuchenkoD;

import org.KostiuchenkoD.Lab1.Lab1;
import org.KostiuchenkoD.Lab2.Lab2;
import org.KostiuchenkoD.Lab3.Run;
import org.KostiuchenkoD.Lab4.test.JUnit_test;
import org.KostiuchenkoD.Lab5.project.Lab5;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("Lab 1");
        Lab1.start();
        System.out.println("-----------------------------");
        System.out.println("Lab 2");
        Lab2.start();
        System.out.println("-----------------------------");
        System.out.println("Lab 3");
        Run.Main();
        System.out.println("-----------------------------");
        System.out.println("Lab 5");
        Lab5.main();
    }
}
