package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int ageOfPublishment;

    public OperatingSystem(int ageOfPublishment) {
        this.ageOfPublishment = ageOfPublishment;
    }

    public void turnOn() {
        System.out.println("This system is turned on");
    }

    public void turnOff() {
        System.out.println("This system is turned off");
    }

    public void displayAgeOfPublishment() {
        System.out.println("Age of publishment: " + ageOfPublishment);
    }
}
