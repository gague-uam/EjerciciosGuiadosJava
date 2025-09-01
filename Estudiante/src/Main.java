import models.Estudiante;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Gabriela Guerrero", "24010347", 100);

        System.out.println(estudiante.mostrarEstudiante());

        estudiante.revisarPromedio();
    }
}
