package StateDesignPattern;

public class StateDesignPatternMain {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(3);

        machine.insertCoin();
        machine.pressButton();  // Dispenses product

        machine.insertCoin();
        machine.pressButton();  // Dispenses product

        machine.insertCoin();
        machine.pressButton();  // Dispenses product

        machine.insertCoin();
    }
}
