package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldDisplayCorrectMessageWithValue() {
        Display bean = context.getBean(Display.class);
        String result = bean.display(140.40);
        Assertions.assertEquals("The value: 140.4", result);
    }

    @Test
    public void shouldDisplayAddResult() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(12, 13);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void shouldDisplaySubtractResult() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(40, 20);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void shouldDisplayMultiplyResult() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(3, 10);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void shouldDisplayDivideResult() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(50, 25);
        Assertions.assertEquals(2, result);
    }
}