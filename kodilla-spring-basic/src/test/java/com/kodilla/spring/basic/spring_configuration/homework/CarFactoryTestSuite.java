package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarFactoryTestSuite {

    LocalTime localTime;

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    @Test
    public void shouldChooseCarDependingOnDate() {
        Car car = (Car) context.getBean("chooseCarDependingOnSeason");
        String type = car.getCarType();
        System.out.println(type);
        List<String> possibleCars = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleCars.contains(type));
    }

    @Test
    public void shouldTurnedOnTheLightsDependingOnTime() {
        Car car = (Car) context.getBean("chooseCarDependingOnSeason");
        boolean type = car.hasHeadLightsTurnedOn();
        System.out.println(type);
        Assertions.assertFalse(type);
    }
}