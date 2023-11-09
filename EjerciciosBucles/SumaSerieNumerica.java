package EjerciciosBucles;

import java.util.Scanner;

public class SumaSerieNumerica {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solucion1();
        solucion2();

        sc.close();
    }

    public static void solucion1() {

        final int INCREMENTO = 3;
        int suma = 0;
        int contadorOperandos = 1;
        int operando = 1;

        System.out.print("Introduce un numero mayor que 10: ");
        int numOperandos = sc.nextInt();

        if (numOperandos <= 10) {
            System.out.println("Has introducido un numero no solicitado, cerrando programa");
            return;
        }

        while (contadorOperandos <= numOperandos) {

            suma += operando;
            System.out.print(operando);

            if (contadorOperandos < numOperandos) {
                System.out.print(" + ");
            }

            contadorOperandos++;
            operando += INCREMENTO;
        }
        System.out.println(" = " + suma);
    }

    public static void solucion2() {
        System.out.println("Calculadora de suma de serie numérica");
        System.out.print("Introduce el valor del término en el que finaliza la serie (mayor que 10): ");
        int numeroFin = sc.nextInt();

        if (numeroFin <= 10) {
            System.out.println("El número introducido debe ser mayor que 10.");
        } else {
            int suma = 0;
            int termino = 1;
            String expresion = "";

            for (int i = 1; i <= numeroFin; i++) {
                suma += termino;
                expresion += termino;

                if (i < numeroFin) {
                    expresion += " + ";
                }

                termino += 3;
            }

            System.out.println("La suma de la serie es: " + expresion + " = " + suma);
        }
    }
}
