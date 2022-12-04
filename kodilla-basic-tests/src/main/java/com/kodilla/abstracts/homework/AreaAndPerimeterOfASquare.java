package com.kodilla.abstracts.homework;

public class AreaAndPerimeterOfASquare extends Shape {

    private double a;

    public AreaAndPerimeterOfASquare(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double surfaceArea() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
