package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] operations = cashMachine.getComplitedTransactions();
        assertEquals(0, operations.length);
    }

    @Test
    public void shouldAddTwoOperations() {
        cashMachine.addMoneyIntoAccount(20);
        cashMachine.addMoneyIntoAccount(100);

        int[] operations = cashMachine.getComplitedTransactions();
        assertEquals(2, operations.length);
        assertEquals(20, operations[0]);
        assertEquals(100, operations[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        cashMachine.addMoneyIntoAccount(20);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(-20);
        int balance = cashMachine.balance();
        assertEquals(100, balance);
    }

    @Test
    public void shouldReturnZeroPaymentsWhenArrayIsEmpty() {
        int numberOfPayments = cashMachine.numberOfTransactionsPerformed();
        assertEquals(0, numberOfPayments);
    }

    @Test
    void shouldReturnZeroPaymentsWhenOnlyWithdrawsInArray() {
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(-100);
        cashMachine.addMoneyIntoAccount(-20);
        int numberOfPayments = cashMachine.numberOfTransactionsPerformed();
        assertEquals(0, numberOfPayments);
    }

    @Test
    void shouldReturnTwoPayments() {
        cashMachine.addMoneyIntoAccount(20);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(-20);
        int numberOfPayments = cashMachine.numberOfTransactionsPerformed();
        assertEquals(2, numberOfPayments,0.01);
    }
    @Test
    public void shouldReturnZeroWithdrawsWhenArrayIsEmpty() {
        int numberOfWithdraws = cashMachine.numberOfDisbursementFromCashMachine();
        assertEquals(0, numberOfWithdraws,0.01);
    }

    @Test
    void shouldReturnZeroWithdrawsWhenOnlyPaymentsInArray() {
        cashMachine.addMoneyIntoAccount(20);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(20);
        int numberOfWithdraws = cashMachine.numberOfDisbursementFromCashMachine();
        assertEquals(0, numberOfWithdraws,0.01);
    }

    @Test
    void shouldReturnTwoWithdraws() {
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(-20);
        int numberOfWithdraws = cashMachine.numberOfDisbursementFromCashMachine();
        assertEquals(2, numberOfWithdraws,0.01);
    }

    @Test
    void shouldCalculateAverageOfPayments() {
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(40);
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(160);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(-80);
        double paymentsAvg = cashMachine.averageOfPayments();
        assertEquals(100,paymentsAvg,0.01);
    }

    @Test
    void shouldCalculateAverageOfWithdraws() {
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(40);
        cashMachine.addMoneyIntoAccount(-20);
        cashMachine.addMoneyIntoAccount(160);
        cashMachine.addMoneyIntoAccount(100);
        cashMachine.addMoneyIntoAccount(-80);
        double paymentsAvg = cashMachine.averageOfDisbursement();
        assertEquals(40,paymentsAvg,0.01);
    }

}