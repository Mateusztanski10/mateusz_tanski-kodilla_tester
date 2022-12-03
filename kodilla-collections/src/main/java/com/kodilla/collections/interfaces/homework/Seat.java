package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {

    private int speed;
    private static int decreaseValue = 10;
    private static int increaseValue = 35;

    public Seat(int speed) {
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
