package AbstractFactoryDesignPattern;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("You are clicking the Window Button");
    }
}
