package design_patterns.decorator.notifiers.notifier;

public class EmailNotifier extends BaseNotifier {
    public EmailNotifier() {
    }

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("send message " + message + " by email ");
    }
}
