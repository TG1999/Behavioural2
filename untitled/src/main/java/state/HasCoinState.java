package state;

public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected.");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select item first.");
    }
}
