package exercises.observer;

public class Main {
    public static void main(String[] args) {
        var errorLogger = new ErrorLogger();
        var errorSlackNotifier = new ErrorSlackNotifier();
        var errorEmailNotifier = new ErrorEmailNotifier();

        var broadcaster = new ErrorBroadcaster();
        broadcaster.subscribe(errorLogger);
        broadcaster.subscribe(errorSlackNotifier);
        broadcaster.subscribe(errorEmailNotifier);

        broadcaster.submitError(new Error(ErrorPriority.CRITICAL, "Critical prio error"));

    }
}
