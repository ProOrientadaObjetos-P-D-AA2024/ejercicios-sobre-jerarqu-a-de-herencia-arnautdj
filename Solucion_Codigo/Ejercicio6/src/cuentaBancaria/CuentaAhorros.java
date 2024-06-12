package cuentaBancaria;

class CuentaAhorros extends CuentaBancaria {
    private static final double tasaInteres = 0.05;

    public CuentaAhorros(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        double interes = balance * tasaInteres;
        depositar(interes);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (balance >= cantidad) {
                balance -= cantidad;
            } else {
                System.out.println("Fondos insuficientes en la cuenta de ahorros.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        }
    }
}