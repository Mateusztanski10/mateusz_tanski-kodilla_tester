package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank() {
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
    }

    public void addMoneyIntoCashMachine1(int money) {
        if (money % 20 == 0) {
            this.cashMachine1.addMoneyIntoAccount(money);
        }
    }

    public void addMoneyIntoCashMachine2(int money) {
        if (money % 20 == 0) {
            this.cashMachine2.addMoneyIntoAccount(money);
        }
    }

    public void addMoneyIntoCashMachine3(int money) {
        if (money % 20 == 0) {
            this.cashMachine3.addMoneyIntoAccount(money);
        }
    }

    public int cashMachine1Incomes() {
        return this.cashMachine1.balance();
    }

    public int cashMachine2Incomes() {
        return this.cashMachine2.balance();
    }

    public int cashmachine3Incomes() {
        return this.cashMachine3.balance();
    }

    public int allincomes() {
        int allIncome = cashMachine1Incomes() + cashMachine2Incomes() + cashmachine3Incomes();
        if (allIncome == 0) {
            return 0;
        } else {
            return allIncome;
        }
    }

    public int allPayments() {
        int payments = this.cashMachine1.numberOfTransactionsPerformed() + this.cashMachine2.numberOfTransactionsPerformed() + this.cashMachine3.numberOfTransactionsPerformed();
        if (payments == 0) {
            return 0;
        } else {
            return payments;
        }
    }

    public int allDisbursements() {
        int disbursement = this.cashMachine1.numberOfDisbursementFromCashMachine() + this.cashMachine2.numberOfDisbursementFromCashMachine() + this.cashMachine3.numberOfDisbursementFromCashMachine();
        if (disbursement == 0) {
            return 0;
        } else {
            return disbursement;
        }
    }

    public double averageOfAllPayments() {
        double averagePayments = this.cashMachine1.averageOfPayments() + this.cashMachine2.averageOfPayments() + this.cashMachine3.averageOfPayments();
        if(averagePayments == 0) {
            return 0;
        }else{
            return averagePayments;
        }
    }

    public double averageOfAllDisbbursements() {
        double averageDisbursements = this.cashMachine1.averageOfDisbursement() + this.cashMachine2.averageOfDisbursement() + this.cashMachine3.averageOfDisbursement();
        if(averageDisbursements == 0) {
            return 0;
        }else{
            return averageDisbursements;
        }
    }
}