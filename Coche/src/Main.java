import models.Coche;

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Prado", 2026);

        System.out.print(coche.mostrarInfo());
    }
}
