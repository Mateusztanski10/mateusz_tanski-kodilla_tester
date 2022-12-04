package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        AreaAndPerimeterOfASquare square = new AreaAndPerimeterOfASquare(10);
        AreaAndPerimeterOfARectangle rectangle = new AreaAndPerimeterOfARectangle(6,7);
        AreaAndPerimeterOfATriangle triangle = new AreaAndPerimeterOfATriangle(2,3,4,5);

        displaySurfaceAreaAndPerimeterOfSquare(square);
        displaySurfaceAreaAndPerimeterOfRectangle(rectangle);
        displaySurfaceAreaAndPerimeterOfTriangle(triangle);
    }

    public static void displaySurfaceAreaAndPerimeterOfSquare(AreaAndPerimeterOfASquare square) {
        System.out.println("Surface area of square is = " + square.surfaceArea() + ", perimeter is = " + square.perimeter());
    }

    public static void displaySurfaceAreaAndPerimeterOfRectangle(AreaAndPerimeterOfARectangle rectangle) {
        System.out.println("Surface area of rectangle is = " + rectangle.surfaceArea() + ", perimeter is = " + rectangle.perimeter());
    }

    public static void displaySurfaceAreaAndPerimeterOfTriangle(AreaAndPerimeterOfATriangle triangle) {
        System.out.println("Surface area of triangle is = " + triangle.surfaceArea() + ", perimeter is = " + triangle.perimeter());
    }
}

