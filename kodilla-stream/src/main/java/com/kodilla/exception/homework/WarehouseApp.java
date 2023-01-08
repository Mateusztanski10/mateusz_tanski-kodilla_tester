package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("Milk"));
        warehouse.addOrder(new Order("Soap"));
        warehouse.addOrder(new Order("Lemon"));
        warehouse.addOrder(new Order("Banana"));
        warehouse.addOrder(new Order("Ham"));
    }
}
