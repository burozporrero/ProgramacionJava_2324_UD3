package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BilleteTren {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        solucion1();
        solucion2();
    }

    public static void solucion1() {

        DecimalFormat df = new DecimalFormat(".00");

        double precioBillete;
        double precioKilometro = 0;
        double precioTotal;

        System.out.println("1.- Billete Sencillo");
        System.out.println("2.- Bille de Ida y Vuelta");
        System.out.print("Indique que tipo de billete tiene: ");
        int billete = sc.nextInt();

        if (billete == 1) {
            precioKilometro = 0.33;
        } else if (billete == 2) {
            precioKilometro = 0.26;
        } else {
            System.out.println("No ha introducido un billete correcto");
            System.exit(0);
        }

        System.out.println(" ");

        System.out.print("De cuantos kilometros es su viaje: ");
        double kilometros = sc.nextDouble();

        precioBillete = precioKilometro * kilometros;

        System.out.println(" ");

        System.out.print("Tiene la tarjeta interrail (s/n): ");
        String tarjeta = sc.next();

        if ("s".equalsIgnoreCase(tarjeta)) {
            precioTotal = precioBillete - (precioBillete * 0.25);
        } else if (precioBillete > 110) {
            precioTotal = precioBillete - (precioBillete * 0.10);
        } else if (precioBillete > 50) {
            precioTotal = precioBillete - (precioBillete * 0.05);
        } else {
            precioTotal = precioBillete;
        }

        System.out.printf("%s", "Su precio de billete " + (billete == 1 ? "sencillo" : " ida y vuelta") +
                " tiene un descuento de un 25% y con un precio final de " + (df.format(precioTotal)) + "€");

    }

    /* La siguiente solución es más rebuscada y lleva demasiados returns, pero tiene conceptos interesantes que
    conviene revisar.
     */
    public static void solucion2() {

        final double PRECIO_IDA = 0.33;
        final double PRECIO_IDA_VUELTA = 0.26;
        String mensaje;
        double km;
        double importe;
        double importeFinal = 0.0;

        System.out.println("-----------------\nIntroduzca un número para elegir destino:\n1.Castellón\n2.Madrid\n3.Utiel\n4.Alicante\n5.Torrevieja\n6.Granada\n-----------------");
        int destino = sc.nextInt();
        System.out.println("-----------------\nIndique si el viaje es de ida y vuelta con el número 1 o 2:\n1. Sí\n2. No\n-----------------");
        int idaVuelta = sc.nextInt();

        km = switch (destino) {
            case 1 -> 110.5;
            case 2 -> 330.3;
            case 3 -> 50.12;
            case 4 -> 180.45;
            case 5 -> 225.7;
            case 6 -> 496.2;
            default -> 0;
        };

        if ((idaVuelta != 1 && idaVuelta != 2) || km == 0) {
            System.out.println("-----------------\nERROR, el destino o el tipo de billete no es válido, vuelva a " +
                    "empezar la operación por favor" +
                    ".\n-----------------");
            return;
        } else if (idaVuelta == 1) {
            importe = (PRECIO_IDA_VUELTA * (km * 2));
            System.out.printf("-----------------\nVa a realizar un viaje de ida y vuelta de %.2f kilómetros, con un importe de %.2f€\n-----------------", km * 2, importe);

        } else {
            importe = PRECIO_IDA * km;
            System.out.printf("-----------------\nVa a realizar un viaje de ida de %.2f kilómetros, con un importe de %.2f€\n-----------------\n", km, importe);
        }

        System.out.println("\nIndique si es usted usuario de la tarjeta Interrail con el número 1 o 2:\n1. Sí\n2. No\n-----------------");
        int interrail = sc.nextInt();

        if (interrail != 1 && interrail != 2) {
            System.out.println("-----------------\nERROR, respuesta no válida, vuelva a empezar la operación por favor.\n-----------------");
            return;

        } else if (interrail == 1) {
            importeFinal = importe - ((importe * 25) / 100);
            mensaje = "-----------------\nSe le aplicará un 25 por 100 de descuento en su billete ser usuario de la tarjeta Interrail.\nEl precio final es de: %.2f€\n¡Buen viaje!\n-----------------";

        } else if (importe >= 100) {
            importeFinal = importe - ((importe * 10) / 100);
            mensaje = "-----------------\nSe le aplicará un 10 por 100 de descuento en su billete por superar los 100€.\nEl precio final es de: %.2f€\n¡Buen viaje!\n-----------------";

        } else if (importe >= 50) {
            importeFinal = importe - ((importe * 5) / 100);
            mensaje = "-----------------\nSe le aplicará un 5 por 100 de descuento en su billete por superar los 50€.\nEl precio final es de: %.2f€\n¡Buen viaje!\n-----------------";

        } else {
            mensaje = "-----------------\nNo se aplican descuentos.\nEl precio final es de: %.2f€\n¡Buen " +
                    "viaje!\n-----------------";
        }
        System.out.printf(mensaje, importeFinal);
    }
}
