package TemplateDesignPattern;

abstract class Beverage {
    public final void prepareBeverage() {
        boilWater();
        brew();  // Abstract method, must be implemented by subclass
        pourInCup();
        if (addCondiments()) {  // Hook method, can be overridden by subclass
            addCondiment();
        }
    }

    // Common step for all beverages
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Abstract method for brewing, to be implemented by subclass
    protected abstract void brew();

    // Common step for all beverages
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Hook method, can be overridden by subclass
    protected boolean addCondiments() {
        return true;
    }

    // Abstract method for adding condiments, to be implemented by subclass
    protected abstract void addCondiment();
}
