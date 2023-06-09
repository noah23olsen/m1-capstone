package com.techelevator;

import com.techelevator.view.Menu;


public class Customer {
    private double max_Amount = 1000.00;

    private double maxToDeposit = 100.00;
    private double starting_Balance = 0.00;
    private double currentCustomerBalance = starting_Balance; //it will get re-asigned as the if conditions take effect

    //throw an error if amount to balance + deposit amount >10000
    //no invalid amount (-1);

    public double getMax_Amount() {
        return max_Amount;
    }
    public void setMax_Amount(double max_Amount) {
        this.max_Amount = max_Amount;
    }

    public double getMaxToDeposit() {
        return maxToDeposit;
    }

    public void setMaxToDeposit(double maxToDeposit) {
        this.maxToDeposit = maxToDeposit;
    }

    public double getStarting_Balance() {
        return starting_Balance;
    }

    public void setStarting_Balance(double starting_Balance) {
        this.starting_Balance = starting_Balance;
    }

    public double getCurrentCustomerBalance() {
        return currentCustomerBalance;
    }

    public void setCurrentCustomerBalance(double currentCustomerBalance) {
        this.currentCustomerBalance = currentCustomerBalance;
    }





    public double depositMoney(int depositAmount) {
        if (depositAmount>0) {
            if (currentCustomerBalance + depositAmount >= starting_Balance
                    && currentCustomerBalance + depositAmount <= max_Amount
                    && depositAmount <= maxToDeposit) {
                currentCustomerBalance = currentCustomerBalance + depositAmount;
                return currentCustomerBalance;
            }
        }


        return currentCustomerBalance;
    }

}
