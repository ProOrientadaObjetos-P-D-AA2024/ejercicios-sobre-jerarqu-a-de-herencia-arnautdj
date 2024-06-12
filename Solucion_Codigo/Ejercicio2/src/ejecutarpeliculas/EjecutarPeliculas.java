package ejecutarpeliculas;

public class EjecutarPeliculas {

    public static void main(String[] args) {
        Dvd dvd1 = new Dvd("Batman", "Bob Kane", 1939, new String[]{"Ingles", 
                           "Español"}, 15.0, 4.7);
        Vhs vhs1 = new Vhs("Superman", "Jerry Siegel", 1933, new String[]
                           {"Ingles"}, 10.0, "Tipo I");

        System.out.println("Datos del DVD:");
        System.out.println("Título: " + dvd1.getTitulo());
        System.out.println("Autor: " + dvd1.getAutor());
        System.out.println("Año: " + dvd1.getAño());
        System.out.print("Idiomas: ");
        for (int i = 0; i < dvd1.getIdiomas().length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(dvd1.getIdiomas()[i]);
        }
        System.out.println();
        System.out.println("Capacidad: " + dvd1.getCapacidadGb() + " GB");
        System.out.println("Precio de alquiler: " + dvd1.calcularPrecioAlquiler());
        System.out.println("Soporte: " + dvd1.getSoporte().getTipo());

        System.out.println("\nDatos del VHS:");
        System.out.println("Título: " + vhs1.getTitulo());
        System.out.println("Autor: " + vhs1.getAutor());
        System.out.println("Año: " + vhs1.getAño());
        System.out.print("Idiomas: ");
        for (int i = 0; i < vhs1.getIdiomas().length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(vhs1.getIdiomas()[i]);
        }
        System.out.println();
        System.out.println("Tipo de cinta: " + vhs1.getTipoCinta());
        System.out.println("Precio de alquiler: " + vhs1.calcularPrecioAlquiler());
        System.out.println("Soporte: " + vhs1.getSoporte().getTipo());
    }
}