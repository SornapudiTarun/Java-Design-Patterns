package TemplateDesignPattern;

public class Coffee extends Beverage{
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding sugar and milk...");
    }

    // Optionally override the hook method
    @Override
    protected boolean addCondiments() {
        return true;  // Coffee typically adds condiments
    }
}
