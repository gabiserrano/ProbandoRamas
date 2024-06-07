public abstract class NotificationDecorator implements ResidentIterator {
    protected ResidentIterator iterator;

    public NotificationDecorator(ResidentIterator iterator) {
        this.iterator = iterator;
    }

    public abstract void sendNotification(Resident resident);
}
