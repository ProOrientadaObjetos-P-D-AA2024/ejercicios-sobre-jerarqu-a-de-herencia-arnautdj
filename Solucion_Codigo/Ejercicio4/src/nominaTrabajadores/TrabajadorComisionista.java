package nominaTrabajadores;

public class TrabajadorComisionista extends Trabajador {
    private double porcentajeComision;
    private double ventasRealizadas;

    public TrabajadorComisionista(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double porcentajeComision, double ventasRealizadas) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = ventasRealizadas;
    }

    public double calcularSueldo() {
        return (porcentajeComision / 100) * ventasRealizadas;
    }
}
