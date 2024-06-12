package ejecutarpeliculas;

public class Pelicula {
    private String titulo;
    private String autor;
    private int año;
    private String[] idiomas;
    private double precioBase;
    private Soporte soporte;

    public Pelicula(String titulo, String autor, int año, String[] idiomas, double precioBase, Soporte soporte) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.idiomas = idiomas;
        this.precioBase = precioBase;
        this.soporte = soporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }

    public double calcularPrecioAlquiler() {
        if (soporte.getTipo().equals("DVD")) {
            return precioBase * 1.10;
        } else {
            return precioBase; 
        }
    }
}