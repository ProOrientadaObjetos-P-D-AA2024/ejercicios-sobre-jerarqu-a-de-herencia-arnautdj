package nominaTrabajadores;

public class Trabajador {
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String dni;
    protected Trabajador jefe;

    public Trabajador(String nombre, String apellidos, String direccion, String dni, Trabajador jefe) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.jefe = jefe;
    }
}
