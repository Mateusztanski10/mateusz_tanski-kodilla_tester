package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if(correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }else{
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        int c = 10;
        int d = 5;
        int subtractResult = calculator2.subtract(c, d);
        boolean correct2 = ResultChecker.assertEquals(5, subtractResult);
        if(correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + c + " i " + d);
        }else{
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + c + " i " + d);
        }

        Calculator calculator3 = new Calculator();
        double e = 2;
        double f = 3;
        double squareUpResult = calculator3.squareUp(e, f);
        boolean correct3 = ResultChecker.assertEquals2(8.0, squareUpResult);
        if(correct3) {
            System.out.println("Metoda squareUp działa poprawnie dla liczby " + e);
        }else{
            System.out.println("Metoda squareUp nie działa poprawnie dla liczby " + e);
        }
    }
}
