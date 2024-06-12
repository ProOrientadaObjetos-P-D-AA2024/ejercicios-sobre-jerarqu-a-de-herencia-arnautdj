package ejecutarpeliculas;

public class Soporte{
    private String tipo;
    private double capacidadGb;
    private String tipoCinta;

    public Soporte(String tipo, double capacidadGb, String tipoCinta) {
        this.tipo = tipo;
        this.capacidadGb = capacidadGb;
        this.tipoCinta = tipoCinta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidadGb() {
        return capacidadGb;
    }

    public void setCapacidadGb(double capacidadGb) {
        this.capacidadGb = capacidadGb;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public void setTipoCinta(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }
}