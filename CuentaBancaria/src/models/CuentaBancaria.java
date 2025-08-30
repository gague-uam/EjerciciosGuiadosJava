package models;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private double cantidad;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String mostrarCuentaBancaria() {
        return "El usuario de esta cuenta es: " + this.titular + ", actualmente su saldo es: C$" + this.saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Se han depositado: C$" + cantidad);
    }

    public void sacar(double cantidad) {
        this.saldo -= cantidad;
        System.out.println("Se han retirado: C$" + cantidad);
    }
}
