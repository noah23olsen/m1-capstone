package com.techelevator;


public class CashRegister {
    //moreso a cash register /cash box
    //make sure we dont override stuff
    private double max_Amount = 1000.00;

    private double maxToDeposit = 100.00;
    private double starting_Balance = 0.00;
    private double currentCashRegisterBalance = starting_Balance; //it will get re-asigned as the if conditions take effect

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

    public double getCurrentCashRegisterBalance() {
        return currentCashRegisterBalance;
    }

    public void setCurrentCashRegisterBalance(double currentCashRegisterBalance) {
        this.currentCashRegisterBalance = currentCashRegisterBalance;
    }





    public double depositMoney(int depositAmount) throws InvalidDepositException {
            if (depositAmount > 0)  {
                if (currentCashRegisterBalance + depositAmount >= starting_Balance
                        && currentCashRegisterBalance + depositAmount <= max_Amount
                        && depositAmount <= maxToDeposit) {
                    currentCashRegisterBalance = currentCashRegisterBalance + depositAmount;
                    return currentCashRegisterBalance;
                }
                throw new InvalidDepositException("please enter a valid amount");
            }
            else throw new InvalidDepositException("please an amount over zero");




    }


}
