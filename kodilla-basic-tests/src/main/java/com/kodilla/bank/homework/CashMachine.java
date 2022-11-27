package com.kodilla.bank.homework;

public class CashMachine {

    private int[] complitedTransactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.complitedTransactions = new int[0];
        this.numberOfTransactions = 0;
    }

    public int numberOfTransactionsPerformed() {
        int payment = 0;
        if(complitedTransactions.length == 0) {
            return 0;
        }else{
            for(int i = 0; i < complitedTransactions.length; i++) {
                if(complitedTransactions[i] > 0) {
                    payment += 1;
                }
            }
        }
        return payment;
    }

    public void addMoneyIntoAccount(int value) {
        numberOfTransactions++;
        int[] newTab = new int[this.numberOfTransactions];
        System.arraycopy(complitedTransactions, 0, newTab, 0, complitedTransactions.length);
        newTab[this.numberOfTransactions - 1] = value;
        this.complitedTransactions = newTab;
    }

    public int[] getComplitedTransactions() {
        return complitedTransactions;
    }

    public int numberOfDisbursementFromCashMachine() {
        int disbursment = 0;
        if(complitedTransactions.length == 0) {
            return 0;
        }else{
            for(int i = 0; i < complitedTransactions.length; i++) {
                if(complitedTransactions[i] < 0) {
                    disbursment += 1;
                }
            }
        }
        return disbursment;
    }

    public int balance() {
        if(complitedTransactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < complitedTransactions.length; i++) {
            sum = sum + complitedTransactions[i];
            System.out.println(sum);
        }
        return sum;
    }

    public double averageOfPayments() {
        if(complitedTransactions.length == 0) {
            return 0;
        }else{
            double average = 0;
            int operations = 0;
            for(int i = 0; i < complitedTransactions.length; i++) {
                if(complitedTransactions[i] > 0) {
                    average += complitedTransactions[i];
                    operations++;
                }
            }
            return average/operations;
        }
    }

    public double averageOfDisbursement() {
        if (complitedTransactions.length == 0) {
            return 0;
        } else {
            double avg = 0;
            int operation = 0;
            for (int i = 0; i < complitedTransactions.length; i++) {
                if (complitedTransactions[i] < 0) {
                    avg += complitedTransactions[i];
                    operation += 1;
                }
            }
            return avg / operation * -1;
        }
    }
}
