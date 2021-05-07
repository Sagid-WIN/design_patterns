package design_patterns.decorator.notifiers.notifier;

public class SMSNotifier extends BaseNotifier {
    public SMSNotifier() {
    }

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("send message " + message +" by SMS");
    }
}
