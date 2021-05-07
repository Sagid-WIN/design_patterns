package design_patterns.decorator.notifiers;

import design_patterns.decorator.notifiers.notifier.*;

public class Launch {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifier(new TelegramNotifier(new SlackNotifier(new EmailNotifier())));
        notifier.send("Поехали!!!");
    }
}
