package com.kodilla.execution_model.homework;

public class Order {

    private double valueOfOrder;
    private double date;
    private String login;

    public Order(double valueOfOrder, double date, String login) {
        this.valueOfOrder = valueOfOrder;
        this.date = date;
        this.login = login;
    }

    public double getValueOfOrder() {
        return valueOfOrder;
    }

    public double getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}
