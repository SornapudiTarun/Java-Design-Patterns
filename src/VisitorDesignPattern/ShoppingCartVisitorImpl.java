package VisitorDesignPattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    public int visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book: " + book.getName() + ", Price: " + cost);
        return cost;
    }

    public int visit(Fruit fruit) {
        int cost = fruit.getPrice();
        System.out.println("Fruit: " + fruit.getName() + ", Price: " + cost);
        return cost;
    }
}
