package nominaTrabajadores;

public class Ejecutor {

    public static void main(String[] args) {
        
        Jefe jefe = new Jefe("Santiago", "Rosales", "Av Eduardo Kigman", "1194058375", 3000.0);
        TrabajadorFijoMensual trabajador1 = new TrabajadorFijoMensual("Daniel", "Ludena", "Argelia", "1899472384", jefe, 1000.0);
        TrabajadorComisionista trabajador2 = new TrabajadorComisionista("Valentina", "Samaniego", "Lourdes y Bernardo", "119483661", jefe, 15.0, 4877);
        TrabajadorPorHoras trabajador3 = new TrabajadorPorHoras("Esther", "Mendez", "10 de Agosto y 24 de Mayo", "1183744624", jefe, 15.0, 20.0, 45);

        System.out.println("Jefe: " + jefe.nombre + " " + jefe.apellidos + ", Sueldo: " + jefe.calcularSueldo());
        System.out.println("Trabajador Fijo Mensual: " + trabajador1.nombre + " " + trabajador1.apellidos + ", Sueldo: " + trabajador1.calcularSueldo());
        System.out.println("Trabajador Comisionista: " + trabajador2.nombre + " " + trabajador2.apellidos + ", Sueldo: " + trabajador2.calcularSueldo());
        System.out.println("Trabajador por Horas: " + trabajador3.nombre + " " + trabajador3.apellidos + ", Sueldo: " + trabajador3.calcularSueldo());
    }
}
