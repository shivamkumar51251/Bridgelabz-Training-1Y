package com.gla.multithreading;
public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("Rohit", "Premium"));
        Thread regular = new Thread(new BankAccount("Virat", "Regular"));
        Thread basic = new Thread(new BankAccount("Gill", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
