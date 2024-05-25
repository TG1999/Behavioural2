package Memento;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", new balance: " + balance);
        } else {
            System.out.println("Insufficient funds, withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public Memento save() {
        return new Memento(balance);
    }

    public void restore(Memento memento) {
        this.balance = memento.getBalance();
        System.out.println("Restored balance: " + balance);
    }

    // Memento class
    public static class Memento {
        private final double balance;

        private Memento(double balance) {
            this.balance = balance;
        }

        private double getBalance() {
            return balance;
        }
    }
}

