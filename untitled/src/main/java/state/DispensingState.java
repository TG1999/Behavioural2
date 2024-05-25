package state;

public class DispensingState implements State {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait, already dispensing.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject, already dispensing.");
    }

    @Override
    public void selectItem() {
        System.out.println("Already dispensing.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing item.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}
