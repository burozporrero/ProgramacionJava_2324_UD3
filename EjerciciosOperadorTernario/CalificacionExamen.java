package EjerciciosOperadorTernario;

import java.util.Scanner;

public class CalificacionExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la puntuación del examen: ");
        int puntuacion = scanner.nextInt();

        String calificacion = (puntuacion >= 90) ? "A" : (puntuacion >= 80) ? "B" : (puntuacion >= 70) ? "C" : (puntuacion >= 60) ? "D" : "F";

        System.out.println("Puntuación: " + puntuacion + " => Calificación: " + calificacion);

        scanner.close();
    }
}
