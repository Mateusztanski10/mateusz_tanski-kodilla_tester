package com.kodilla.inheritance.homework;

public class SystemChecking {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1980);
        operatingSystem.turnOff();
        operatingSystem.turnOn();

        Ubuntu ubuntu = new Ubuntu(1968);
        ubuntu.turnOff();
        ubuntu.turnOn();

        Linux linux = new Linux(1970);
        linux.turnOff();
        linux.turnOn();
        linux.displayAgeOfPublishment();
    }
}
