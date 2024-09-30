package SingletonDesignPattern;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("2051224");
        Logger log2 = Logger.getInstance();
        log2.log("Tarun");

        System.out.println(log1==log2?"Same Instance is used":"Not the same instance");
    }
}
