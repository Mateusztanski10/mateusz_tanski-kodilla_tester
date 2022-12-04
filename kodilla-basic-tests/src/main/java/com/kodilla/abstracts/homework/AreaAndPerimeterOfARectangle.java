package com.kodilla.abstracts.homework;

public class AreaAndPerimeterOfARectangle extends Shape {

    private double a;
    private double b;

    public AreaAndPerimeterOfARectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double surfaceArea() {
        return a* b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
