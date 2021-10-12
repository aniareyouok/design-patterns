package exercises.decorator;

public class EmailNotifier extends DecoratedNotifier {

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending e-mail message");
        notifier.sendNotification(message);
    }
}
