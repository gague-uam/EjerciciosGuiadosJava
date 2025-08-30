import models.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("La cancion de Aquiles", "Madeline Miller", 392);

        System.out.println(libro.mostrarLibro());
    }
}
