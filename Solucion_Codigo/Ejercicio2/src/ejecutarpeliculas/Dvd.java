package ejecutarpeliculas;

public class Dvd extends Pelicula {
    private double capacidadGb;

    public Dvd(String titulo, String autor, int año, String[] idiomas, double precioBase, double capacidadGb) {
        super(titulo, autor, año, idiomas, precioBase, new Soporte("DVD", capacidadGb, null));
        this.capacidadGb = capacidadGb;
    }

    public double getCapacidadGb() {
        return capacidadGb;
    }

    public void setCapacidadGb(double capacidadGb) {
        this.capacidadGb = capacidadGb;
    }
}