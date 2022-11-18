package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int ageOfPublishment) {
        super(ageOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("This system will be turn on in 5 minutes");
    }

    @Override
    public void turnOff() {
        System.out.println("This system will be turn off in 5 minutes");
    }
}
