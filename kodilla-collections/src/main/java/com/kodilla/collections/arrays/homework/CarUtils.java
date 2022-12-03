package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Seat;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("---------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Current speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if(car instanceof Audi)
            return "Audi";
        else if(car instanceof Mercedes)
            return "Mercedes";
        else if(car instanceof Seat)
            return "Seat";
        else
            return "Unknown car name";
    }
}
