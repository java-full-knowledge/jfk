package ExerciseClasses;


public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this(id, name);
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance = balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balacne");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += balance;
            balance = 0;
        } else
            System.out.println("Amount exceeded balacne");
        return balance;
    }

    public String toString() {
        return ("Account [id = " + id + ",name = " + name + ",balance = " + balance + "]");
    }
}
