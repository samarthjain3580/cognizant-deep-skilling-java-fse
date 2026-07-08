package singleton;

public class TestLogger {

	public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("Singleton Pattern Working");

        System.out.println(logger1);
        System.out.println(logger2);

        System.out.println(logger1 == logger2);
    }
}
