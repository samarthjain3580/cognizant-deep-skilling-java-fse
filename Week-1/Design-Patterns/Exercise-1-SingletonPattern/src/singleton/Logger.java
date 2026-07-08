package singleton;

public class Logger {

    // Single instance of Logger
    private static Logger instance = new Logger();

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Public method to get the single instance
    public static Logger getInstance() {
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}