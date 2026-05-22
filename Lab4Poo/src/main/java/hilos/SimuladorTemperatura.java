package hilos;


import java.util.Random;
import modelos.ControlTemperatura;


public class SimuladorTemperatura implements Runnable{

    private ControlTemperatura control;
    private Random random;

    //constructor
    public SimuladorTemperatura(ControlTemperatura control) {
        this.control = control;
        this.random = new Random();

    }

    @Override

    public void run(){
        while (true) {
            try {
                double nuevaTemperatura = generarTemperatura();

                control.actualizarTemperatura(nuevaTemperatura);

                System.out.println(
                        "Temperatura actualizada: "
                                + nuevaTemperatura + " °C");

                // espera por 30 segundos
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                System.out.println("Error en el hilo: " + e.getMessage());
            }
    }
}

    public double generarTemperatura() {

        // aca generara un número entre 0 y 40
        return random.nextDouble() * 40;
    }
}