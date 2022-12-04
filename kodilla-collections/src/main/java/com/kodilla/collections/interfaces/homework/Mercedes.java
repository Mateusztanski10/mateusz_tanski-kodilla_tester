package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Mercedes{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercedes mercedes = (Mercedes) o;
        return speed == mercedes.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
