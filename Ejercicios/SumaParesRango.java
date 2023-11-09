package Ejercicios;

import java.util.Scanner;

public class SumaParesRango {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limiteInferior, limiteSuperior;

        System.out.println("Indique el límite inferior:");
        limiteInferior = scanner.nextInt();

        System.out.println("Indique el límite superior:");
        limiteSuperior = scanner.nextInt();

        int sumaPares = sumaPares(limiteInferior, limiteSuperior);

        System.out.println("La suma de los números pares entre " + limiteInferior + " y " + limiteSuperior + " es: " + sumaPares);
    }

    public static int sumaPares(int limiteInferior, int limiteSuperior) {
        int suma = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
