package nominaTrabajadores;

public class Jefe extends Trabajador {
    private double sueldoFijo;

    public Jefe(String nombre, String apellidos, String direccion, String dni, double sueldoFijo) {
        super(nombre, apellidos, direccion, dni, null);
        this.sueldoFijo = sueldoFijo;
    }

    public double calcularSueldo() {
        return sueldoFijo;
    }
}
