package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    private int speed;
    private static int decreaseValue = 30;
    private static int increaseValue = 55;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseValue;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decreaseValue;
    }
}
