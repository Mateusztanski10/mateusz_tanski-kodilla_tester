package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void ShouldDeliverPackageWhenWeightIsLessThan30() {
        String message = bean.sendPackage("Rodman", 25);
        Assertions.assertEquals("Package delivered to: Rodman", message);
    }

    @Test
    public void ShouldNotDeliverPackageWhenWeightIsBiggerThan30() {
        String message = bean.sendPackage("Rodman", 35);
        Assertions.assertEquals("Package not delivered to: Rodman", message);
    }
}