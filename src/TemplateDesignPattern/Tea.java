package TemplateDesignPattern;

public class Tea extends Beverage{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding lemon...");
    }

    // Optionally override the hook method
    @Override
    protected boolean addCondiments() {
        return true;  // Tea always adds condiments
    }
}
