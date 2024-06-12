package nominaTrabajadores;

public class TrabajadorFijoMensual extends Trabajador {
    private double sueldoFijo;

    public TrabajadorFijoMensual(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double sueldoFijo) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.sueldoFijo = sueldoFijo;
    }

    public double calcularSueldo() {
        return sueldoFijo;
    }
}
