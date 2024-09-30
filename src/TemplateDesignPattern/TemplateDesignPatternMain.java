package TemplateDesignPattern;

public class TemplateDesignPatternMain {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Preparing tea...");
        tea.prepareBeverage();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Preparing coffee...");
        coffee.prepareBeverage();
    }
}
