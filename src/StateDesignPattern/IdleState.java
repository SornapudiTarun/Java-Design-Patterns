package StateDesignPattern;

public class IdleState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());

    }

    @Override
    public void pressButton() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted, cannot dispense.");
    }
}
