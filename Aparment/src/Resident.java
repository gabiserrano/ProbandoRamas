public class Resident {
    private String nombres;
    private String apellidos;
    private int numeroApartamento;
    private double saldoDeudor;
    private String numeroTelefono;
    private String correoElectronico;

    public Resident(String nombres, String apellidos, int numeroApartamento, double saldoDeudor, String numeroTelefono, String correoElectronico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroApartamento = numeroApartamento;
        this.saldoDeudor = saldoDeudor;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "Residente: " + nombres + " " + apellidos + ", Apartamento: " + numeroApartamento + ", Saldo Deudor: $" + saldoDeudor;
    }
}


