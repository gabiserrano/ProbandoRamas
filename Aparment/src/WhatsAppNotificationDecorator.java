public class WhatsAppNotificationDecorator extends NotificationDecorator {
    public WhatsAppNotificationDecorator(ResidentIterator iterator) {
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
        // Aquí se implementaría el envío de mensaje por WhatsApp
        System.out.println("Enviando mensaje por WhatsApp a " + resident.toString());
    }
}
