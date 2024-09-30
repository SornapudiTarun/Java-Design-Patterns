package StateDesignPattern;

public class VendingMachine {
        private VendingMachineState idleState;
        private VendingMachineState hasCoinState;
        private VendingMachineState dispensingState;
        private VendingMachineState outOfStockState;

        private VendingMachineState currentState;
        private int productCount;

        public VendingMachine(int productCount) {
            this.productCount = productCount;

            idleState = new IdleState(this);
            hasCoinState = new HasCoinState(this);
            dispensingState = new DispensingState(this);
            outOfStockState = new OutOfStockState(this);

            if (productCount > 0) {
                currentState = idleState;
            } else {
                currentState = outOfStockState;
            }
        }

        public void insertCoin() {
            currentState.insertCoin();
        }

        public void pressButton() {
            currentState.pressButton();
            currentState.dispense();
        }

        public void setState(VendingMachineState state) {
            currentState = state;
        }

        public VendingMachineState getIdleState() {
            return idleState;
        }

        public VendingMachineState getHasCoinState() {
            return hasCoinState;
        }

        public VendingMachineState getDispensingState() {
            return dispensingState;
        }

        public VendingMachineState getOutOfStockState() {
            return outOfStockState;
        }

        public int getProductCount() {
            return productCount;
        }

        public void releaseProduct() {
            if (productCount > 0) {
                productCount--;
            }
        }

}
