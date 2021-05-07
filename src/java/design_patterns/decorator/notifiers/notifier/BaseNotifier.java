package design_patterns.decorator.notifiers.notifier;

/**
 * Либо убираем пустые конструкторы и ставим заглушку
 * Не знаю что туда можно внедрить чтобы работала...
 */
public abstract class BaseNotifier implements Notifier {
    private Notifier notifier;

    public BaseNotifier() {}

    public BaseNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        if (notifier != null) {
            notifier.send(message);
        }
    }
}
