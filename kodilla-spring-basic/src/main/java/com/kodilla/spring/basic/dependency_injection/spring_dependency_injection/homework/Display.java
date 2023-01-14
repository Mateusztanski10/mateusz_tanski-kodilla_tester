package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Display {

    public String display(double value) {
        return "The value: " + value;
    }
}
