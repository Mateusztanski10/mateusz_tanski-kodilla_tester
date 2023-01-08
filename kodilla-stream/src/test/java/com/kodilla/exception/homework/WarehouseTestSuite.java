package com.kodilla.exception.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    static Warehouse warehouse;

    @BeforeAll
    public static void setUp() {
        warehouse = new Warehouse();

        warehouse.addOrder(new Order("Milk"));
        warehouse.addOrder(new Order("Soap"));
        warehouse.addOrder(new Order("Lemon"));
        warehouse.addOrder(new Order("Banana"));
        warehouse.addOrder(new Order("Ham"));
    }

    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        Order isMilkInUse = warehouse.getOrder("Milk");
        assertTrue(isMilkInUse != null);
    }

    @Test
    public void testIsOrderInUse_withException() {
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Cucumber"));
    }
}