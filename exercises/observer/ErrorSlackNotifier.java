package exercises.observer;

public class ErrorSlackNotifier implements ErrorObserver {

    @Override
    public void notify(java.lang.Error error) {
        System.out.println("Error detected, sending Slack notification");
    }
}
