package SingletonDesignPattern;

public class Logger {
    private static Logger logger;

    private Logger(){
        System.out.println("Logger initialized");
    }

    public static Logger getInstance(){
        if (logger==null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message){
        System.out.println("Log Entry : "+message);
    }
}
