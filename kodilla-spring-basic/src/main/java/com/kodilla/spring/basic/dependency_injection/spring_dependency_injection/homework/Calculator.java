package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    @Autowired
    public void displayMyValue(Display display) {
        this.display = display;
    }

    public double add (double a, double b) {
        this.display.display();
        double result = (a + b);
        return result;
    }

    public double subtract (double a, double b) {
        this.display.display();
        double result = (a - b);
        return result;
    }

    public double multiply (double a, double b) {
        this.display.display();
        double result = (a * b);
        return result;
    }
    public double divide (double a, double b) {
        this.display.display();
        double result = (a / b);
        return result;
    }
}
