package com.gbsplus.exceptions;

public class TransactionManager {


    public boolean canMakeWithdrawal(double amount) throws InvalidTransactionException {
        if (amount < 2000) {
            throw new InvalidTransactionException("Insufficient funds");
        }
        return true;
    }

}
