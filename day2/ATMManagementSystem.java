package CP.day2;

/*
Case 2: ATM Management System
🔸 Scenario:You are designing an ATM System that allows users to withdraw, deposit, and check balance.🔸 Classes:
    Account (accountNumber, holderName, balance)
    Transaction (transactionId, date, amount, type)
    ATM (location, machineId)
🔸 Tasks:
    Apply abstraction: Make ATM an abstract class with methods like withdraw(), deposit().
    Create two account types: SavingsAccount and CurrentAccount. Use inheritance.
    Implement method overriding for withdrawal logic (e.g., savings has minimum balance).
    Store transactions in a list and implement encapsulation for transaction details.
    Use interface TransactionLogger to log all transactions.
 */

import java.util.*;
import java.util.Date;
import java.util.UUID;

class Account {

    // data ko private kiya hai
    private String accountNumber;
    private String holderName;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    // constructor banaya hai jo data set karega
    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    // getters and setters lagaya hai jisse private data access ho sake
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }
}

class Transaction {
    private String transactionId;
    private Date date;
    private static double amount = 10000.0;
    private String type;

    public Transaction(String transactionId, Date date, double amount, String type) {
        this.transactionId = transactionId;
        this.date = date;
        Transaction.amount = amount;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public Date getDate() {
        return date;
    }
    public static double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return transactionId + " | " + date + " | " + type + " | " + amount;
    }
}

abstract class ATM {
    private String location;
    private String machineId;

    public ATM(String location, String machineId) {
        this.location = location;
        this.machineId = machineId;
    }

    public String getLocation() {
        return location;
    }
    public String getMachineId() {
        return machineId;
    }

    public abstract void withdraw(Account account, double amount);
    public abstract void deposit(Account account, double amount);
}

interface TransactionLogger {
    void logTransaction(Account account, Transaction t);
}

class SavingsAccount extends ATM implements TransactionLogger {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (account.getBalance() - amount >= MIN_BALANCE) {
            account.setBalance(account.getBalance() - amount);
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            logTransaction(account, t);
        } else {
            System.out.println("Withdrawal denied: Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
        logTransaction(account, t);
    }

    @Override
    public void logTransaction(Account account, Transaction t) {
        account.addTransaction(t);
        System.out.println("Transaction logged: " + t);
    }
}

class CurrentAccount extends ATM implements TransactionLogger {
    public CurrentAccount(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            logTransaction(account, t);
        } else {
            System.out.println("Withdrawal denied: Insufficient funds.");
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
        logTransaction(account, t);
    }

    @Override
    public void logTransaction(Account account, Transaction t) {
        account.addTransaction(t);
        System.out.println("Transaction logged: " + t);
    }
}

public class ATMManagementSystem {
    public static void main(String[] args) {
        Account acc1 = new Account("SBI78596", "Sneha", 2000);
        ATM savingsATM = new SavingsAccount("Lucknow", "ATM01");
        ATM currentATM = new CurrentAccount("Delhi", "ATM02");

        savingsATM.deposit(acc1, 1000);
        savingsATM.withdraw(acc1, 2300);
        currentATM.withdraw(acc1, 5000);

        System.out.println("\nFinal Balance: " + acc1.getBalance());
        System.out.println("Transactions:");
        for (Transaction t : acc1.getTransactions()) {
            System.out.println(t);
        }
    }
}