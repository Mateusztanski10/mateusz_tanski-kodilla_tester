package com.kodilla.exception.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    static Warehouse warehouse;

    @BeforeAll
    public static void setUp() {
        warehouse = new Warehouse();
    }

    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        String isMilkInUse = warehouse.isOrderInUse("Milk");
        assertTrue(Boolean.parseBoolean(isMilkInUse));
    }

    @Test
    public void testIsOrderInUse_withException() {
        assertThrows(OrderDoesntExistException.class, () -> warehouse.isOrderInUse("Cucumber"));
    }
}