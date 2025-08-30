package models;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String mostrarLibro() {
        return "El titulo del libro es: " + this.titulo + ", el autor es: " + this.autor + ", el paginas es: " + this.numPaginas;
    }
}
