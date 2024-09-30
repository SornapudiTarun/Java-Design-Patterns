package StateDesignPattern;

public class OutOfStockState implements VendingMachineState {
    private VendingMachine machine;

    public OutOfStockState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Out of stock. Cannot insert coin.");
    }

    @Override
    public void pressButton() {
        System.out.println("Out of stock.");
    }

    @Override
    public void dispense() {
        System.out.println("No product to dispense.");
    }
}
