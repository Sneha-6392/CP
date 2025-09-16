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

// creaet ineterface for transactions
interface TransactionLogger {
    void logTransaction(Transaction transaction);
}

// Transaction class
class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;

    // to set the data
    public Transaction(String transactionId, Date date, double amount, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    // to get the data
    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date +
                ", Amount: " + amount + ", Type: " + type;
    }
}

// Account class
class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 10000;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        } else {
            System.out.println(" Cannot withdraw. Maintain minimum balance of ₹500.");
            return false;
        }
    }
}

// CurrentAccount class =>
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println(" Insufficient balance.");
            return false;
        }
    }
}

// Abstract ATM class
abstract class ATM implements TransactionLogger {
    protected String location;
    protected String machineId;

    public ATM(String location, String machineId) {
        this.location = location;// to fix the atm postions to track the machine
        this.machineId = machineId;// each machine has id
    }

    public abstract void withdraw(Account account, double amount);

    public abstract void deposit(Account account, double amount);

    public void logTransaction(Transaction transaction) {
        System.out.println(" Transaction logged ,........:=> " + transaction);
    }
}

// Concrete ATM implementation
class MyATM extends ATM {

    public MyATM(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        boolean success = false;

        if (account instanceof SavingsAccount) {
            success = ((SavingsAccount) account).withdraw(amount);
        } else if (account instanceof CurrentAccount) {
            success = ((CurrentAccount) account).withdraw(amount);
        }

        if (success) {
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            account.transactions.add(t);
            logTransaction(t);
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.balance += amount;
        Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
        account.transactions.add(t);
        logTransaction(t);
    }
}

// Main class
public class ATMManagementSystem {
    public static void main(String[] args) {
        ATM atm = new MyATM("Delhi", "ATM001");

        // Create accounts
        SavingsAccount sa = new SavingsAccount("S001", "satyaa", 2000);
        CurrentAccount ca = new CurrentAccount("C001", "shivay", 3000);

        // Transactions
        atm.deposit(sa, 1000);
        atm.withdraw(sa, 1200);
        atm.withdraw(sa, 2500);

        atm.deposit(ca, 2000);
        atm.withdraw(ca, 4000);
        atm.withdraw(ca, 2000); // fail due to insufficient funds

        // Print transactions
        System.out.println(" Savings Account Transactions => .....:");
        sa.printTransactions();

        System.out.println(" Current Account Transactions=> ........:");
        ca.printTransactions();
    }
}





/*
 * import java.util.*;
 * import java.util.Date;
 * import java.util.UUID;
 * 
 * // class Account banaya hai jisme account ke details hai
 * class Account {
 * 
 * // data ko private kiya hai
 * private String accountNumber;
 * private String holderName;
 * private double balance;
 * private List<Transaction> transactions = new ArrayList<>();
 * 
 * // constructor banaya hai jo data set karega
 * public Account(String accountNumber, String holderName, double
 * initialBalance) {
 * this.accountNumber = accountNumber;
 * this.holderName = holderName;
 * this.balance = initialBalance;
 * this.transactions = new ArrayList<>();
 * }
 * 
 * // getters and setters lagaya hai jisse private data access ho sake
 * public String getAccountNumber() {
 * return accountNumber;
 * }
 * public String getHolderName() {
 * return holderName;
 * }
 * public double getBalance() {
 * return balance;
 * }
 * 
 * public void setBalance(double balance) {
 * this.balance = balance;
 * }
 * 
 * public List<Transaction> getTransactions() {
 * return transactions;
 * }
 * 
 * public void addTransaction(Transaction t) {
 * transactions.add(t);
 * }
 * }
 * 
 * // class Transaction banaya hai jisme transaction ke details hai
 * class Transaction {
 * private String transactionId;
 * private Date date;
 * private static double amount = 10000.0;
 * private String type;
 * 
 * // to set the data
 * public Transaction(String transactionId, Date date, double amount, String
 * type) {
 * this.transactionId = transactionId;
 * this.date = date;
 * Transaction.amount = amount;
 * this.type = type;
 * }
 * 
 * public String getTransactionId() {
 * return transactionId;
 * }
 * public Date getDate() {
 * return date;
 * }
 * public static double getAmount() {
 * return amount;
 * }
 * public String getType() {
 * return type;
 * }
 * 
 * @Override
 * public String toString() {
 * return transactionId + " | " + date + " | " + type + " | " + amount;
 * }
 * }
 * 
 * abstract class ATM {
 * private String location;
 * private String machineId;
 * 
 * public ATM(String location, String machineId) {
 * this.location = location;
 * this.machineId = machineId;
 * }
 * 
 * public String getLocation() {
 * return location;
 * }
 * public String getMachineId() {
 * return machineId;
 * }
 * 
 * // abstract hata de toh nhi chalega because ATM is abstract class hai
 * public abstract void withdraw(Account account, double amount);
 * public abstract void deposit(Account account, double amount);
 * }
 * 
 * interface TransactionLogger {
 * void logTransaction(Account account, Transaction t);
 * }
 * 
 * // Saving Account
 * class SavingsAccount extends ATM implements TransactionLogger {
 * private static final double MIN_BALANCE = 500.0;
 * 
 * public SavingsAccount(String location, String machineId) {
 * super(location, machineId);
 * }
 * 
 * @Override
 * public void withdraw(Account account, double amount) {
 * if (account.getBalance() - amount >= MIN_BALANCE) {
 * account.setBalance(account.getBalance() - amount);
 * Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(),
 * amount, "Withdraw");
 * logTransaction(account, t);
 * } else {
 * System.out.println("Withdrawal denied: Minimum balance of " + MIN_BALANCE +
 * " must be maintained.");
 * }
 * }
 * 
 * @Override
 * public void deposit(Account account, double amount) {
 * account.setBalance(account.getBalance() + amount);
 * Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(),
 * amount, "Deposit");
 * logTransaction(account, t);
 * }
 * 
 * @Override
 * public void logTransaction(Account account, Transaction t) {
 * account.addTransaction(t);
 * System.out.println("Transaction logged: " + t);
 * }
 * }
 * 
 * // Current Account
 * class CurrentAccount extends ATM implements TransactionLogger {
 * public CurrentAccount(String location, String machineId) {
 * super(location, machineId);
 * }
 * 
 * @Override
 * public void withdraw(Account account, double amount) {
 * if (account.getBalance() >= amount) {
 * account.setBalance(account.getBalance() - amount);
 * Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(),
 * amount, "Withdraw");
 * logTransaction(account, t);
 * } else {
 * System.out.println("Withdrawal denied: Insufficient funds.");
 * }
 * }
 * 
 * @Override
 * public void deposit(Account account, double amount) {
 * account.setBalance(account.getBalance() + amount);
 * Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(),
 * amount, "Deposit");
 * logTransaction(account, t);
 * }
 * 
 * @Override
 * public void logTransaction(Account account, Transaction t) {
 * account.addTransaction(t);
 * System.out.println("Transaction logged: " + t);
 * }
 * }
 * 
 * // main class jaha se program start hoga
 * public class ATMManagementSystem {
 * public static void main(String[] args) {
 * Account acc1 = new Account("SBI78596", "Sneha", 2000);
 * ATM savingsATM = new SavingsAccount("Lucknow", "ATM01");
 * ATM currentATM = new CurrentAccount("Delhi", "ATM02");
 * 
 * savingsATM.deposit(acc1, 1000);
 * savingsATM.withdraw(acc1, 2300);
 * currentATM.withdraw(acc1, 5000);
 * 
 * System.out.println("\nFinal Balance: " + acc1.getBalance());
 * System.out.println("Transactions:");
 * for (Transaction t : acc1.getTransactions()) {
 * System.out.println(t);
 * }
 * }
 * }
 */