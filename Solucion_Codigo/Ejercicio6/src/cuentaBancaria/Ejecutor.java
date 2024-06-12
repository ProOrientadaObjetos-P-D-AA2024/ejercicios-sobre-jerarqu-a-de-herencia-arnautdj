package cuentaBancaria;

public class Ejecutor {

    public static void main(String[] args) {
        
        CuentaCheques cuenta1 = new CuentaCheques("20994827622", "Santiago Rosales");
        CuentaAhorros cuenta2 = new CuentaAhorros("29983473601", "Valentina Samaniego");
        CuentaPlatino cuenta3 = new CuentaPlatino("20878462744", "Daniel Ludena");

        cuenta1.depositar(1000);
        cuenta1.retirar(500);

        cuenta2.depositar(2000);
        cuenta2.calcularInteres(); // Interes mensual

        cuenta3.depositar(3000);
        cuenta3.calcularInteres(); // Interes mensual

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        
    }
    
}
