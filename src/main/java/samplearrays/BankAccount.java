package samplearrays;

import java.lang.reflect.AccessibleObject;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount>0) {
            this.currentBalance += amount;
            for (int i = 0; i < transactions.length; i++) {
                if(transactions[i]==0){
                    transactions[i] = amount;
                    break;
                }
            }
            System.out.println("Name: " + this.name + ".\nAmount to deposit: "+amount+".\nCurrent balance: "+this.currentBalance+".");
            return;
        }
        System.out.println("Deposit failed.");


    }

    public void withdraw(double amount){
        if(amount>0 && this.currentBalance>=amount) {
            this.currentBalance -= amount;
            System.out.println("Withdrawal successful.");

        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i]==0){
                transactions[i] = -amount;
                break;
            }
        }
        return;
        }
        System.out.println("Withdrawal successful.");

    }

    public void displayTransactions(){
        System.out.println("Account Transactions :");
        for(double transaction:transactions){
            if(transaction == 0) return;
            System.out.println("Transaction : " + transaction);
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance: " + this.currentBalance );
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
