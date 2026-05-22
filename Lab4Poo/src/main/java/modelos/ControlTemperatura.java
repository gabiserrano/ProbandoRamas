package modelos;


public class ControlTemperatura extends SistemaMonitoreo{

    private double temperaturaActual;

    //constructor
    public  ControlTemperatura(String ubicacion, String escala){

        super(ubicacion, escala);
    }

    //metodo sincronizado
    public synchronized boolean actualizarTemperatura(double nuevaTemperatura) {
        this.temperaturaActual = nuevaTemperatura;

        return true;
    }

    //getter
    public synchronized double getTemperaturaActual(){
        return temperaturaActual;

    }
    @Override

    public void mostrarInformacion(){
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Escala: " + escala);
        System.out.println("Temperatura actual: " + temperaturaActual + " °C");
    }
}