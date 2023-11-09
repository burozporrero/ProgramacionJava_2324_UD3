package EjerciciosSwitch;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el primer operando: ");
        float a = sc.nextFloat();
        System.out.println("Escriba el segundo operando: ");
        float b = sc.nextFloat();

        System.out.println("Escriba una operacion de entre las siguientes +, -, /, +: ");

        String cadena = sc.next();
        char operacion = cadena.charAt(0);

        switch (operacion) {
            case '+':
                System.out.printf("El resultado de la suma %f %c %f = %f", a, operacion, b, a + b);
                break;
            case '-':
                System.out.printf("El resultado de la resta %f %c %f = %f", a, operacion, b, a - b);
                break;
            case '/':
                System.out.printf("El resultado de la división %f %c %f = %f", a, operacion, b, a / b);
                break;
            case '*':
                System.out.printf("El resultado de la multiplicación %f %c %f = %f", a, operacion, b, a * b);
                break;
            default:
                System.out.println("La operación introducida no es aceptada por el programa, lo siento");
        }

        sc.close();
    }
}
