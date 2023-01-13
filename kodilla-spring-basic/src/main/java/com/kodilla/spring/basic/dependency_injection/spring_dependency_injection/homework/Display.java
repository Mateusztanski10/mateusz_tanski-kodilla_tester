package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Display {

    public double display(double value){
            System.out.println("Please, write your value: ");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextDouble();
            return value;
    }
}
