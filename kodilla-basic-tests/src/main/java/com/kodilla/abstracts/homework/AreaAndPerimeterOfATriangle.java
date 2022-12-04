package com.kodilla.abstracts.homework;

public class AreaAndPerimeterOfATriangle extends Shape {

   private double a;
   private double b;
   private double c;
   private double h;

   public AreaAndPerimeterOfATriangle(double a, double b, double c, double h) {
       this.a = a;
       this.b = b;
       this.c = c;
       this.h = h;
   }

   public double getA() {
       return a;
   }

   public double getB() {
       return b;
   }

   public double getC() {
       return c;
   }

   public double getH() {
       return h;
   }

    @Override
    public double surfaceArea() {
        return a * h / 2;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
