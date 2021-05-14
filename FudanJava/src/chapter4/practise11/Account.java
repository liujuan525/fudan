package chapter4.practise11;

import java.time.LocalDate;

// 4-11
public class Account {
    private int id;
    private double balance;
    private double annulRate;
    private LocalDate dateCreated;

    public Account() {
        super();
    }

    public Account(int id, double balance) {
        super();
        this.id = id;
        this.balance = balance;
//        dateCreated = new LocalDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnulRate() {
        return annulRate;
    }

    public void setAnnulRate(double annulRate) {
        this.annulRate = annulRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annulRate / 12;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public static void main(String[]args) {
        Account myAccount = new Account(101,1000.00);
        myAccount.deposit(100);
        myAccount.withdraw(200);
        System.out.println("The balance = " + myAccount.getBalance());
    }





}
