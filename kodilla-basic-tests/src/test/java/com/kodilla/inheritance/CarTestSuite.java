package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTestSuite {

    Car car = new Car(4, 5);

    @Test
    public void TestGetSeats() {
        Assertions.assertEquals(5, car.getSeats());
    }

    @Test
    public void TestGetWheels() {
        Assertions.assertEquals(4, car.getWheels());
    }

    @Test
    public void TestOpenDoors() {
        Assertions.assertEquals("Opening 4 doors", car.openDoors());
    }
}