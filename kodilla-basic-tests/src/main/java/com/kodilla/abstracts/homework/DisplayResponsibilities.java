package com.kodilla.abstracts.homework;

public class DisplayResponsibilities {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Person person = new Person("Antoni", 24, driver);
        person.displayPersonsResponsibilities();

        Soldier soldier = new Soldier();
        Person person1 = new Person("Włodzimierz", 45, soldier);
        person1.displayPersonsResponsibilities();
    }
}
