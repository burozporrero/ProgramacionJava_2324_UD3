package EjerciciosIfElse;

import java.util.Scanner;

public class MayorMenorEntre2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solucion1();
        solucion2();
        sc.close();
    }

    public static void solucion1(){

        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println(num1 + " es el mayor y " + num2 + " el menor");
            } else {
                System.out.println(num2 + " es el mayor y " + num1 + " el menor");
            }
        } else {
            System.out.println(num2 + " es igual a " + num1);
        }
    }

    public static void solucion2(){
        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1, num2) + " es el mayor y " + Math.min(num1, num2) + " el menor");
    }
}
