public class SMSNotificationDecorator extends NotificationDecorator {
    public SMSNotificationDecorator(ResidentIterator iterator) {
        super(iterator);
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Resident next() {
        return iterator.next();
    }

    @Override
    public void sendNotification(Resident resident) {
        // Aquí se implementaría el envío de SMS
        System.out.println("Enviando SMS a " + resident.toString());
    }
}

