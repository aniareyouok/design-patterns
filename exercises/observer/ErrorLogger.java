package exercises.observer;

public class ErrorLogger implements ErrorObserver {
    @Override
    public void notify(Error error) {

        System.out.println("Logging error: [%s] %s\n", error.priority, error.message);
    }
}
