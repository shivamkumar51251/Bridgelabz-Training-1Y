package com.gla.multithreading;
class BankAccount implements Runnable {
    private String name;
    private String type;
    BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override
    public void run() {
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Aniket", "Savings");
        BankAccount b2 = new BankAccount("Rahul", "Current");

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
