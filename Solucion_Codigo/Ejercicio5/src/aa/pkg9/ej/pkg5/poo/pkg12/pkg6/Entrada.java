
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

public class Entrada {
    private static int contadorEntradas = 1;

    private int identificador;
    private String nombreComprador;
    private Zona zona;

    public Entrada(String nombreComprador, Zona zona) {
        this.identificador = contadorEntradas++;
        this.nombreComprador = nombreComprador;
        this.zona = zona;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public Zona getZona() {
        return zona;
    }

    public double calcularPrecio() {
        return zona.getPrecioNormal();
    }
}

