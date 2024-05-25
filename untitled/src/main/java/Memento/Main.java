package Memento;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        TransactionHistory transactionHistory = new TransactionHistory();

        bankAccount.deposit(200);
        transactionHistory.save(bankAccount);

        bankAccount.withdraw(150);
        transactionHistory.save(bankAccount);

        bankAccount.withdraw(100);
        transactionHistory.save(bankAccount);

        System.out.println("Current Balance: " + bankAccount.getBalance());

        transactionHistory.undo(bankAccount);
        System.out.println("After Undo: " + bankAccount.getBalance());

        transactionHistory.undo(bankAccount);
        System.out.println("After Undo: " + bankAccount.getBalance());

        transactionHistory.undo(bankAccount);
        System.out.println("After Undo: " + bankAccount.getBalance());
    }
}

