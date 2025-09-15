package CP.day2;

/*
Case 2: ATM Management System
🔸 Scenario:You are designing an ATM System that allows users to withdraw, deposit, and check balance.🔸 Classes:
    Account (accountNumber, holderName, balance)
    Transaction (transactionId, date, amount, type)
    ATM (location, machineId)
🔸 Tasks:Apply abstraction: Make ATM an abstract class with methods like withdraw(), deposit().
Create two account types: SavingsAccount and CurrentAccount. Use inheritance.
Implement method overriding for withdrawal logic (e.g., savings has minimum balance).
Store transactions in a list and implement encapsulation for transaction details.
Use interface TransactionLogger to log all transactions.
 */

 import java.util.*;

 
