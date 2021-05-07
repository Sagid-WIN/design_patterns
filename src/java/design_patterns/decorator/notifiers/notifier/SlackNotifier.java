package design_patterns.decorator.notifiers.notifier;

public class SlackNotifier extends BaseNotifier {
    public SlackNotifier() {
    }

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("send message " + message + " by Slack");
    }
}
