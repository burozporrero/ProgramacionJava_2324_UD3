package EjerciciosIfElse;

import java.util.Scanner;

public class MayorMenorEntre2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}
