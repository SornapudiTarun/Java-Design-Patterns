package AbstractFactoryDesignPattern;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have checked the Mac CheckBox");
    }
}
