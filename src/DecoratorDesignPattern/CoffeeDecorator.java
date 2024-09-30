package DecoratorDesignPattern;

public class CoffeeDecorator implements Coffee{
    protected Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffee){
        this.coffeeDecorator=coffee;
    }
    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public double getCost() {
        return coffeeDecorator.getCost();
    }
}
