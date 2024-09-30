package VisitorDesignPattern;

public class VisitorDesignPatternMain {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book("Design Patterns", 500),
                new Book("Effective Java", 600),
                new Fruit("Banana", 20),
                new Fruit("Apple", 30)
        };

        // Create the visitor
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        // Calculate total price
        int totalCost = 0;
        for (ItemElement item : items) {
            totalCost += item.accept(visitor);
        }

        System.out.println("Total Cost: " + totalCost);
    }
}
