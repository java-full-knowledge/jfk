package com.jfk.class;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public static void main(String []args){
        Account account = new Account("15", "Gago", 1000);
        System.out.println(account.getID());
        System.out.println(account.getName());
        System.out.println(account.getBalance());
    }

    public Main(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Main(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public int transfer(Account acc, int amount){
        if(amount <= this.balance) {
            // Don't know what to do
        }else{
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public String toString(){
        return "Account[id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]";
    }
}
