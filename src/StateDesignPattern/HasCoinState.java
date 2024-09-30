package StateDesignPattern;

public class HasCoinState implements VendingMachineState {
    private VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed.");
        machine.setState(machine.getDispensingState());  // Transition to "Dispensing" state
    }

    @Override
    public void dispense() {
        System.out.println("Press button to dispense.");
    }
}
