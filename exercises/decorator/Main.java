package exercises.decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SlackNotifier(new EmailNotifier(new NotifierImpl()));
        notifier.sendNotification("Here comes an important message");

    }
}
