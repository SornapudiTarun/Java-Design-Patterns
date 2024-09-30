package StateDesignPattern;

public class DispensingState implements VendingMachineState {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, already dispensing.");
    }

    @Override
    public void pressButton() {
        System.out.println("Already processing.");
    }

    @Override
    public void dispense() {
        System.out.println("Product dispensed.");
        if (machine.getProductCount() > 0) {
            machine.setState(machine.getIdleState());  // Transition back to "Idle" state
        } else {
            machine.setState(machine.getOutOfStockState());  // Transition to "Out of Stock" state
        }
    }
}