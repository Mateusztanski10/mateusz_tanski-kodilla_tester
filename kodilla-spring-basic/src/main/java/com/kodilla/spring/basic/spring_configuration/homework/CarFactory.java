package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCarDependingOnSeason() {
        Car car;
        LocalDate localDate = LocalDate.now();
        if(localDate.isAfter(LocalDate.of(2023, 6, 20)) && localDate.isBefore(LocalDate.of(2023, 9, 22))) {
            car = new Cabrio();
        } else if (localDate.isAfter(LocalDate.of(2023, 12, 21)) && localDate.isBefore(LocalDate.of(2024, 3, 20))) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
