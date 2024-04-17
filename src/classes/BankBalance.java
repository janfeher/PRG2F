package classes;

class Data {
    private final String owner;
    private double balance;

    Data(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void printAll() {
        System.out.println("Name: " + owner);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void transfer(Data owner, double amount) {
        balance -= amount;
        owner.balance += amount;
    }
}

public class BankBalance {
    public static void main(String[] args) {
        Data a = new Data("Neco", 5000);
        Data b = new Data("Neco2", 2000);

        a.deposit(5000);
        a.transfer(b, 3500);

        a.printAll();
        b.printAll();
    }
}
