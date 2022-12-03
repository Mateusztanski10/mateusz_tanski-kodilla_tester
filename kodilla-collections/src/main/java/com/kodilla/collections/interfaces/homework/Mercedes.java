package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed;
    private static int decreaseValue = 20;
    private static int increaseValue = 40;

    public Mercedes(int speed) {
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
