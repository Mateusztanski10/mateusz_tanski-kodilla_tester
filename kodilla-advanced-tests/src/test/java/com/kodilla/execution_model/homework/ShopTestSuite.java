package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private static Shop shop;

    @BeforeAll
    public static void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(4.70, 2021.09, "Tea"));
        shop.addOrder(new Order(9.25, 2021.10, "Ham"));
        shop.addOrder(new Order(1.40, 2022.12, "Ice Cream"));
        shop.addOrder(new Order(6.10, 2022.08, "Banana"));
        shop.addOrder(new Order(8.40, 2023.01, "Cheese"));
        shop.addOrder(new Order(10.50, 2022.04, "Paper"));
    }

    @Test
    public void addOrderTest() {
        assertEquals(6, shop.getSizeOfOrders());
    }

    @Test
    public void getListWithOrdersFromLastTwoYearsTest() {
        assertEquals(3, shop.getListWithOrdersFromLastTwoYears(2022.05));
    }

    @Test
    public void getOrderBetweenMinValueAndMaxValueTest() {
        assertEquals(3, shop.getOrderBetweenMinValueAndMaxValue(6.50, 10.60));
    }

    @Test
    public void getAllOrdersValueTest() {
        assertEquals(40.35, Shop.getAllOrdersValue());
    }

    @AfterAll
    public static void sendGoodByeMessage() {
        System.out.println("Tests have already ended, thank you.");
    }
}