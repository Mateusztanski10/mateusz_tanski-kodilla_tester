package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {

        Random random = new Random();
        int printCarName = random.nextInt(3);
        int randomCar = getRandomSpeed(random);

        if(printCarName == 0)
            return new Audi(randomCar);
        else if(printCarName == 1)
            return new Mercedes(randomCar);
        else if(printCarName == 2)
            return new Seat(randomCar);
        else
            return null;
    }

    private static int getRandomSpeed(Random random) {
        return random.nextInt(81);
    }
}
