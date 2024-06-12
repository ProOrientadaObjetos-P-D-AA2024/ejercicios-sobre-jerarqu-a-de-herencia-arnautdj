package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

import java.util.ArrayList ;
import java.util.List ;

public class AA9Ej5POO126 {
    
    
        private static List<Entrada> listaEntradas = new ArrayList<>();

        public static void main(String[] args) {
         
            Zona principal = new Zona("Principal", 200, 25, 17.5);
            Zona palcoB = new Zona("PalcoB", 40, 70, 40);
            Zona central = new Zona("Central", 400, 20, 14);
            Zona lateral = new Zona("Lateral", 100, 15.5, 10);

          
            venderEntrada("Juan", new EntradaNormal("Juan", principal));
            venderEntrada("María", new EntradaAbonado("María", central));
            venderEntrada("Pedro", new EntradaReducida("Pedro", lateral));

        
            consultarEntrada(1); 
            consultarEntrada(2); 
            consultarEntrada(3); 
            consultarEntrada(4); 
        }

        public static void venderEntrada(String nombreComprador, Entrada entrada) {
            Zona zona = entrada.getZona();
            if (zona.venderEntrada()) {
                System.out.println("Entrada vendida a " + nombreComprador + " - Identificador: " + entrada.getIdentificador()
                        + " - Precio: " + entrada.calcularPrecio() + "$ - Zona: " + zona.getNombreZona());
            
                listaEntradas.add(entrada);
            } else {
                System.out.println("Lo siento, la zona " + zona.getNombreZona() + " está completa.");
            }
        }

        public static void consultarEntrada(int identificador) {
     
            Entrada entrada = buscarEntradaPorIdentificador(identificador);
            if (entrada != null) {
                System.out.println("Entrada " + identificador + ": "
                        + "Comprador: " + entrada.getNombreComprador()
                        + ", Precio: " + entrada.calcularPrecio() + "$"
                        + ", Zona: " + entrada.getZona().getNombreZona());
            } else {
                System.out.println("No existe ninguna entrada con el identificador " + identificador);
            }
        }

      
        public static Entrada buscarEntradaPorIdentificador(int identificador) {
            for (Entrada entrada : listaEntradas) {
                if (entrada.getIdentificador() == identificador) {
                    return entrada; 
                }
            }
            return null; 
        }
    }

