
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

public class Zona {
    private String nombreZona;
    private int numeroLocalidades;
    private double precioNormal;
    private double precioAbonado;
    private int localidadesVendidas;

    public Zona(String nombreZona, int numeroLocalidades, double precioNormal, double precioAbonado) {
        this.nombreZona = nombreZona;
        this.numeroLocalidades = numeroLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
        this.localidadesVendidas = 0;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public int getNumeroLocalidades() {
        return numeroLocalidades;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public int getLocalidadesDisponibles() {
        return numeroLocalidades - localidadesVendidas;
    }

    public boolean venderEntrada() {
        if (localidadesVendidas < numeroLocalidades) {
            localidadesVendidas++;
            return true;
        } else {
            return false;
        }
    }
}
