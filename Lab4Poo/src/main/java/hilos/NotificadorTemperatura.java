package hilos;

import modelos.SistemaMonitoreo;

public class NotificadorTemperatura implements Runnable {
    private SistemaMonitoreo control;

    public NotificadorTemperatura(SistemaMonitoreo control) {
        this.control = control;
    }

    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("==Notificacion== ");
                control.mostrarInformacion();
                System.out.println("=====");
                Thread.sleep(35000);
            } catch (InterruptedException e) {
                System.out.println("error en la notifiacicion:" + e.getMessage());

            }
        }
    }
}
