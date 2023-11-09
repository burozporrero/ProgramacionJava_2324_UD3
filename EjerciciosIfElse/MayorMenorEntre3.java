package EjerciciosIfElse;

import java.util.Scanner;

public class MayorMenorEntre3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        solucion1();
        solucion2();
        sc.close();
    }

    public static void solucion1() {

        System.out.print("Introduzca el primer numero entero. A: ");
        int a = sc.nextInt();

        System.out.print("Introduzca el segundo numero entero. B: ");
        int b = sc.nextInt();

        System.out.print("Introduzca el tercer numero entero. C: ");
        int c = sc.nextInt();

        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("ERROR: Ha introducido algún número repetido");
            return;
        }

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("A es el mayor y el menor es C");
                } else {
                    System.out.println("A es el mayor y el menor es B");
                }
            } else {
                System.out.println("C es el mayor y el menor es B");
            }
        } else {
            if (a > c) {
                System.out.println("B es el mayor y el menor es C");
            } else {
                if (b > c) {
                    System.out.println("B es el mayor y el menor es A");
                } else {
                    System.out.println("C es el mayor y el menor es A");
                }
            }
        }
    }

    public static void solucion2() {

        System.out.print("Introduzca el primer numero entero. A: ");
        int a = sc.nextInt();

        System.out.print("Introduzca el segundo numero entero. B: ");
        int b = sc.nextInt();

        System.out.print("Introduzca el tercer numero entero. C: ");
        int c = sc.nextInt();

        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("ERROR: Ha introducido algún número repetido");
            return;
        }

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("A es el mayor y el menor es C");
                } else {
                    System.out.println("A es el mayor y el menor es B");
                }
            } else {
                System.out.println("C es el mayor y el menor es B");
            }
        } else if (a > c) {
            System.out.println("B es el mayor y el menor es C");
        } else if (b > c) {
            System.out.println("B es el mayor y el menor es A");
        } else {
            System.out.println("C es el mayor y el menor es A");
        }
        sc.close();
    }
}
