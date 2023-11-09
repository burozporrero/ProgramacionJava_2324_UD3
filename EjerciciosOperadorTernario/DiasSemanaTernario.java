package EjerciciosOperadorTernario;

import java.util.Scanner;

public class DiasSemanaTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7 para representar un día de la semana: ");
        int numeroDia = scanner.nextInt();

        String nombreDia = (numeroDia >= 1 && numeroDia <= 7) ? 
                            (numeroDia == 1) ? "Lunes" :
                            (numeroDia == 2) ? "Martes" :
                            (numeroDia == 3) ? "Miércoles" :
                            (numeroDia == 4) ? "Jueves" :
                            (numeroDia == 5) ? "Viernes" :
                            (numeroDia == 6) ? "Sábado" : "Domingo" :
                            "Día no válido";

        System.out.println("El día de la semana es: " + nombreDia);

        scanner.close();
    }
}
