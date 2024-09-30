package AbstractFactoryDesignPattern;

public class AbstractFactoryDesignPatternMain {
    public static void main(String[] args) {

        String os = "windows";
        GUIFactory factory;

        if (os.equalsIgnoreCase("Windows")){
            factory = new WindowFactory();
        } else {
            factory = new MacFactory();
        }

        Application application = new Application(factory);
        application.paint();
    }
}
