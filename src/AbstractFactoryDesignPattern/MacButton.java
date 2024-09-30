package AbstractFactoryDesignPattern;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("You are clicking the Mac Button");
    }
}
