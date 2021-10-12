package exercises.decorator;

public class DecoratedNotifier implements Notifier {
    protected Notifier notifier;

    public DecoratedNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendNotification(String message) {
        notifier.sendNotification(message);
    }
}
