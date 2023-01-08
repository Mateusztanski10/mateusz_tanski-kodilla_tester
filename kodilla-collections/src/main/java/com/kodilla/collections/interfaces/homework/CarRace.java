package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Audi audi = new Audi(10);
        doRace(audi);

        Mercedes mercedes = new Mercedes(20);
        doRace(mercedes);

        Seat seat = new Seat(30);
        doRace(seat);
    }

    public static void doRace(Car car) {

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
