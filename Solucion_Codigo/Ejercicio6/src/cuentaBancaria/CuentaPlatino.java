package cuentaBancaria;

class CuentaPlatino extends CuentaBancaria {
    private static double tasaInteres = 0.10;

    public CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        double interes = balance * tasaInteres;
        depositar(interes);
    }
}
