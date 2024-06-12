package cuentaBancaria;

class CuentaBancaria {
    protected String numeroCuenta;
    protected String nombreCliente;
    protected double balance;

    public CuentaBancaria(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            balance -= cantidad;
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + ", Cuenta: " + numeroCuenta + ", Balance: " + balance;
    }
}
