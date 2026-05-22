package modelos;

public abstract class SistemaMonitoreo {
    protected String ubicacion;
    protected  String escala;

    public SistemaMonitoreo(String ubicacion, String escala) {
        this.ubicacion = ubicacion;
        this.escala = escala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
    
    //metodo mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Ubicacion: " + getUbicacion());
        System.out.println("Escala: " + getEscala());
    }
}
