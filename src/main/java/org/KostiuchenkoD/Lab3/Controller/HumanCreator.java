package org.KostiuchenkoD.Lab3.Controller;

import org.KostiuchenkoD.Lab3.Model.Human;

public class HumanCreator {
    public Human createHuman(String firstName, String lastName, String patronymic, Human.Sex sex) {
        return new Human(firstName, lastName, patronymic, sex) {};
    }
}