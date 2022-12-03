package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Audi audi = new Audi();
        doRace(audi);

        Mercedes mercedes = new Mercedes();
        doRace(mercedes);

        Seat seat = new Seat();
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
