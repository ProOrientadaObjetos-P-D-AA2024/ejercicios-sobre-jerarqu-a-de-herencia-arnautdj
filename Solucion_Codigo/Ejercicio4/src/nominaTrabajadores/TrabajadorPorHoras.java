package nominaTrabajadores;

public class TrabajadorPorHoras extends Trabajador {
    private double precioHora;
    private double precioHoraExtra;
    private int horasTrabajadas;

    public TrabajadorPorHoras(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double precioHora, double precioHoraExtra, int horasTrabajadas) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.precioHora = precioHora;
        this.precioHoraExtra = precioHoraExtra;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSueldo() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * precioHora;
        } else {
            return (40 * precioHora) + ((horasTrabajadas - 40) * precioHoraExtra);
        }
    }
}

