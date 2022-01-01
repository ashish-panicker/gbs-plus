package com.gbsplus;

import java.io.IOException;
import com.gbsplus.exceptions.InvalidTransactionException;
import com.gbsplus.exceptions.TransactionManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        TransactionManager tm = new TransactionManager();
        try {
            tm.canMakeWithdrawal(1000);
        } catch (InvalidTransactionException e) {
            System.err.println(e.getMessage());
        }finally{
            System.out.println("Transaction complete.");
        }
    }
}
