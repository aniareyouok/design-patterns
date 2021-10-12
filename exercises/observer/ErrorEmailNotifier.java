package exercises.observer;

public class ErrorEmailNotifier implements ErrorObserver{
    @Override
    public void notify(Error error) {
        if (error.priority.equals(ErrorPriority.CRITICAL)) {
            System.out.println("Critical error detected, sending e-mail notification");
        }
    }
}
