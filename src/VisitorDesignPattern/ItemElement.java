package VisitorDesignPattern;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
