package models;

public class Coche {

    private String marca;
    private String modelo;
    private int fecha_creacion;

    public Coche(String marca, String modelo, int fecha_creacion) {
        this.marca = marca;
        this.modelo= modelo;
        this.fecha_creacion = fecha_creacion;
    }

    public String mostrarInfo() {
        return "La marca del carro es: " + this.marca + ", su modelo es: " + this.modelo + ", siendo del año: " + this.fecha_creacion;
    }
}
