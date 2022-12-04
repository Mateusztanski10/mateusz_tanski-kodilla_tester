package com.kodilla.collections.list.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Audi(100));
        cars.add(new Mercedes(120));
        cars.add(new Seat(200));

        Seat seat = new Seat(180);
        cars.add(seat);
        cars.remove(seat);

        Mercedes mercedes = new Mercedes(120);
        cars.remove(mercedes);

        cars.remove(0);

        System.out.println(cars.size());

        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
