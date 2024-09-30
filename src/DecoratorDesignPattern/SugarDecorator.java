package DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription()+" with Sugar";
    }

    @Override
    public double getCost() {
        return coffeeDecorator.getCost()+5;
    }
}
