package models;

public class Estudiante {

    private String nombre;
    private String matricula;
    private float promedio;

    public Estudiante(String nombre, String matricula, int promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void revisarPromedio() {
        if (this.promedio >= 70) {
            System.out.println("El estudiante aprobó la clase con el promedio de: " + this.promedio);
        } else {
            System.out.println("El estudiante reprobó la clase con el promedio de: " + this.promedio);
        }
    }

    public String mostrarEstudiante() {
        return "Su nombre es: " + this.nombre + ", y su matricula es:, " + this.matricula + "Su promedio es de: " + this.promedio;
    }
}
