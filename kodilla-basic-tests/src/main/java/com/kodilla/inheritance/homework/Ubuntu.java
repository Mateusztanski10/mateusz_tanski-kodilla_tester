package com.kodilla.inheritance.homework;

public class Ubuntu extends OperatingSystem {

    public Ubuntu(int ageOfPublishment) {
        super(ageOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("This system will be turn on tomorrow");
    }

    @Override
    public void turnOff() {
        System.out.println("This system will be turn off at 6 o'clock");
    }
}
