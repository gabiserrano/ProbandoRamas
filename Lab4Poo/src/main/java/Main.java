import hilos.NotificadorTemperatura;
import hilos.SimuladorTemperatura;
import modelos.ControlTemperatura;

public class Main {

    public static void main(String[] args) {

        // Datos quemados
        ControlTemperatura control =
                new ControlTemperatura(
                        "Laboratorio Central",
                        "Celsius"
                );

        // Crear hilo simulador
        Thread simulador =
                new Thread(
                        new SimuladorTemperatura(control)
                );

        // Crear hilo notificador
        Thread notificador =
                new Thread(
                        new NotificadorTemperatura(control)
                );

        // Iniciar hilos
        simulador.start();
        notificador.start();
    }
}