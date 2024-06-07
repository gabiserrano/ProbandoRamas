public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(ResidentIterator iterator) {
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
        // Aquí se implementaría el envío de correo electrónico
        System.out.println("Enviando correo electrónico a " + resident.toString());
    }
}
