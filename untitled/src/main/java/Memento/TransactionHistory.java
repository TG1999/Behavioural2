package Memento;

import java.util.Stack;

public class TransactionHistory {
    private Stack<BankAccount.Memento> mementoStack = new Stack<>();

    public void save(BankAccount bankAccount) {
        mementoStack.push(bankAccount.save());
    }

    public void undo(BankAccount bankAccount) {
        if (!mementoStack.isEmpty()) {
            bankAccount.restore(mementoStack.pop());
        } else {
            System.out.println("No transactions to undo.");
        }
    }
}


