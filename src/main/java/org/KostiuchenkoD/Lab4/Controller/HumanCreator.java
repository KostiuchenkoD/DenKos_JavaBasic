package org.KostiuchenkoD.Lab4.Controller;

import org.KostiuchenkoD.Lab4.Model.Human;

public class HumanCreator {
    public Human createHuman(String firstName, String lastName, String patronymic, Human.Sex sex) {
        return new Human(firstName, lastName, patronymic, sex) {};
    }
}