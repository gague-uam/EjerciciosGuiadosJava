import models.CuentaBancaria;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("Gabriela Guerrero", 1000);

        System.out.println(cb.mostrarCuentaBancaria());
        cb.depositar(200);
        System.out.println(cb.mostrarCuentaBancaria());
        cb.sacar(500);
        System.out.println(cb.mostrarCuentaBancaria());
    }
}
