package EjerciciosIfElse;

import java.util.Scanner;

public class MayorEdad {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mayorEdad();
        sc.close();
    }

    public static void mayorEdad() {
        System.out.print("Indique su edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Usted no es mayor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }
    }
}
