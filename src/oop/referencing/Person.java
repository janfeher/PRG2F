package oop.referencing;

public class Person {
    String name;
    String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class BackAccount {
    long bankID;
    double balance;
    Person owner;

    BackAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Výběr neproběhl");
        return false;
    }

    boolean transaction(double amount, BackAccount other) {
        if (withdraw(amount)) {
            other.deposit(amount);
            return true;
        }
        System.out.println("Převod neproběhl");
        return false;
    }

    public static void main(String[] args) {
        Person o1 = new Person("Karel", "Plzeň");
        Person o2 = new Person("Franta", "Praha");

        BackAccount account1 = new BackAccount(541, 40000, o1);
        BackAccount account2 = new BackAccount(452, 15000, o2);

        if (account1.transaction(5000, account2)) {
            System.out.println(account1.owner.name + " převedl na účet uživatele " + account2.owner.name);
        }
    }
}