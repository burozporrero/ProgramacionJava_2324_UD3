package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumeros {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        conDoWhile();
        conWhile();
        scanner.close();
    }

    public static void conDoWhile() {

        Random random = new Random();

        String respuesta;
        do {
            int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
            int intentos = 0;
            int numeroUsuario;

            System.out.println("¡Adivina el número secreto entre 1 y 100!");
            boolean adivinado = false;

            do {
                System.out.print("¿Cúal crees que es el número? ");
                numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número secreto es mayor.");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número secreto es menor.");
                } else {
                    adivinado = true;
                    System.out.println("¡Correcto! ¡Adivinaste el número en " + intentos + " intentos!");
                }
            } while (!adivinado);

            System.out.print("¿Deseas jugar de nuevo? (s/n): ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Gracias por jugar");
    }

    public static void conWhile() {

        Random random = new Random();

        boolean seguirJugando = true;
        int numeroAleatorio;
        int numeroUsuario;
        int intentos;
        boolean adivinado;

        while (seguirJugando) {
            numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
            intentos = 0;
            adivinado = false;

            System.out.println("Adivina el numero secreto entre 1 y 100!");

            while (!adivinado) {
                System.out.print("Cual crees que es el numero ");
                numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El numero secreto es mayor.");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El numero secreto es menor.");
                } else {
                    adivinado = true;
                    System.out.println("Correcto. Adivinaste el numero en " + intentos + " intentos");
                }
            }

            System.out.println("Deseas seguir jugando? (s/n): ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            seguirJugando = "s".equalsIgnoreCase(scanner.nextLine());
        }

        System.out.println("Gracias por jugar");
    }
}
