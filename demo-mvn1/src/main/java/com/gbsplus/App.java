package com.gbsplus;

import java.io.IOException;
import com.gbsplus.exceptions.InvalidTransactionException;
import com.gbsplus.exceptions.TransactionManager;
import com.gbsplus.singleton.DbConnection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        DbConnection connection;

        connection = DbConnection.getInstance();



        
        // System.out.println("Hello World!");

        // TransactionManager tm = new TransactionManager();
        // try {
        //     tm.canMakeWithdrawal(1000);
        // } catch (InvalidTransactionException e) {
        //     System.err.println(e.getMessage());
        // }finally{
        //     System.out.println("Transaction complete.");
        // }
    }
}
