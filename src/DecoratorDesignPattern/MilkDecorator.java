package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription()+" with Milk";
    }

    @Override
    public double getCost() {
        return coffeeDecorator.getCost()+10;
    }
}
