package AbstractFactoryDesignPattern;

public class WindowCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have checked the Window CheckBox");
    }
}
