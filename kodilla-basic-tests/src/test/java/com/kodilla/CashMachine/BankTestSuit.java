package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {
    Bank bank = new Bank();

    @Test
    public void shouldCalculateFullIncomeIfOperationsOutsideRange() {
        bank.addMoneyIntoCashMachine1(70);
        bank.addMoneyIntoCashMachine1(20);
        bank.addMoneyIntoCashMachine1(20);

        bank.addMoneyIntoCashMachine2(50);
        bank.addMoneyIntoCashMachine2(100);
        bank.addMoneyIntoCashMachine2(100);

        bank.addMoneyIntoCashMachine3(40);
        bank.addMoneyIntoCashMachine3(10);
        bank.addMoneyIntoCashMachine3(40);

        int all = bank.allincomes();
        int cm1 = bank.cashMachine1Incomes();
        int cm2 = bank.cashMachine2Incomes();
        int cm3 = bank.cashmachine3Incomes();
        assertEquals(320, all);
        assertEquals(40, cm1, 0.01);
        assertEquals(200, cm2, 0.01);
        assertEquals(80, cm3, 0.01);
    }

    @Test
    public void shouldCalculateNumberOfWithdrawsIfOperationsInRange() {
        bank.addMoneyIntoCashMachine1(70);
        bank.addMoneyIntoCashMachine1(-20);
        bank.addMoneyIntoCashMachine1(-20);

        bank.addMoneyIntoCashMachine2(50);
        bank.addMoneyIntoCashMachine2(100);
        bank.addMoneyIntoCashMachine2(-100);

        bank.addMoneyIntoCashMachine3(40);
        bank.addMoneyIntoCashMachine3(10);
        bank.addMoneyIntoCashMachine3(40);

        int all = bank.allDisbursements();
        assertEquals(3, all);
    }

    @Test
    public void shouldReturnZeroIfNoPayments() {
        int all = bank.allPayments();
        assertEquals(0, all);
    }
}