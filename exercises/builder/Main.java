package exercises.builder;

public class Main {
    public static void main(String[] args) {
        // initiate the logger here
        Logger logger = new Logger.Builder().withPrefix("Prefix").withPostfix("Postfix").includesTime(true).build();
        logger.log("New log");
    }
}