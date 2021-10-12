package exercises.decorator;

public class SlackNotifier extends DecoratedNotifier {

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Slack message");
        super.sendNotification(message);
    }
}
