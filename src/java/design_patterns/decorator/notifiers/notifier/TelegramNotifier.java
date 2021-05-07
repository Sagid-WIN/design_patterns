package design_patterns.decorator.notifiers.notifier;

public class TelegramNotifier extends BaseNotifier {
    public TelegramNotifier() {
    }

    public TelegramNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("send message " + message + " by Telegram");
    }
}
