import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Resident> residents = loadResidents();
        ResidentIterator iterator = new ApartmentIterator(residents);

        // Creamos los decoradores para cada medio de notificación
        NotificationDecorator smsDecorator = new SMSNotificationDecorator(iterator);
        NotificationDecorator emailDecorator = new EmailNotificationDecorator(iterator);
        NotificationDecorator whatsappDecorator = new WhatsAppNotificationDecorator(iterator);

        // Iteramos sobre los residentes y enviamos notificaciones por todos los medios
        while (smsDecorator.hasNext()) {
            Resident resident = smsDecorator.next();

            // Enviamos la notificación a través de cada decorador
            smsDecorator.sendNotification(resident);
            emailDecorator.sendNotification(resident);
            whatsappDecorator.sendNotification(resident);

            // Agregamos líneas divisorias entre los mensajes de cada residente
            System.out.println("----------------------------------------");
        }
    }

    // Función para cargar los residentes
    public static List<Resident> loadResidents() {
        List<Resident> residents = new ArrayList<>(10);

        // Creando los primeros cinco residentes con saldo deudor 0
        residents.add(new Resident("Juan", "Gonzalez", 101, 0, "555-1234", "juan@example.com"));
        residents.add(new Resident("Maria", "Lopez", 102, 0, "555-5678", "maria@example.com"));
        residents.add(new Resident("Carlos", "Martinez", 103, 0, "555-9012", "carlos@example.com"));
        residents.add(new Resident("Ana", "Rodriguez", 104, 0, "555-3456", "ana@example.com"));
        residents.add(new Resident("Pedro", "Sanchez", 105, 0, "555-7890", "pedro@example.com"));

        // Creando los últimos cinco residentes con saldo deudor diferente de 0
        residents.add(new Resident("Luis", "Perez", 201, 50.0, "555-1111", "luis@example.com"));
        residents.add(new Resident("Laura", "Gomez", 202, 75.0, "555-2222", "laura@example.com"));
        residents.add(new Resident("Javier", "Diaz", 203, 100.0, "555-3333", "javier@example.com"));
        residents.add(new Resident("Sofia", "Hernandez", 204, 125.0, "555-4444", "sofia@example.com"));
        residents.add(new Resident("Miguel", "Torres", 205, 150.0, "555-5555", "miguel@example.com"));

        return residents;
    }
}

