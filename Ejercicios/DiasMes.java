package Ejercicios;

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mes, anio;
        System.out.print("Indicar un numero de mes(1-12): ");
        mes = entrada.nextInt();

        System.out.print("Indicar un año: ");
        anio = entrada.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El mes tiene 31 dias");
            case 4, 6, 9, 11 -> System.out.println("El mes tiene 30 dias");
            case 2 -> {

                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                    System.out.println("El mes tiene 29 dias");
                }
                else
                    System.out.println(
                            "El mes tiene 28 dias");
            }

            default -> System.out.println("Numero de mes equivocado");
        }

        System.out.println("-----------------------------");

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
                    System.out.println("El mes tiene 29 dias");
                else
                    System.out.println("El mes tiene 28 dias");
                break;
            default:
                System.out.println("Numero de mes equivocado");
        }

        entrada.close();
    }
}
