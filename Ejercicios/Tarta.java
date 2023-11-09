package Ejercicios;

import java.util.Scanner;

public class Tarta {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        conIfAnidado();
        conElseIf();

        scanner.close();
    }

    public static void conIfAnidado() {

        System.out.println("Bienvenido a la pastelería. ¿De qué sabor desea la tarta?");
        System.out.println("1. Manzana (18 euros)");
        System.out.println("2. Fresa (16 euros)");
        System.out.println("3. Chocolate Negro (14 euros)");
        System.out.println("4. Chocolate Blanco (15 euros)");

        int opcionSabor = scanner.nextInt();

        double costeBase = 0;
        String sabor = "";

        if (opcionSabor == 1) {
            costeBase = 18;
            sabor = "Manzana";
        } else {

            if (opcionSabor == 2) {
                costeBase = 16;
                sabor = "Fresa";

            } else {

                if (opcionSabor == 3) {
                    costeBase = 14;
                    sabor = "Chocolate Negro";

                } else {
                    if (opcionSabor == 4) {
                        costeBase = 15;
                        sabor = "Chocolate Blanco";
                    } else {
                        System.out.println("Opción no válida.");
                    }

                }
            }
        }

        double costeNata = 0;
        double costePersonalizacion = 0;

        System.out.println("¿Desea añadir nata? (s/n)");
        String opcionNata = scanner.next();
        if (opcionNata.equalsIgnoreCase("s")) {
            costeNata = 2.50;
        }

        System.out.println("¿Desea personalizar con un nombre? (s/n)");
        String opcionPersonalizacion = scanner.next();
        if (opcionPersonalizacion.equalsIgnoreCase("s")) {
            costePersonalizacion = 2.75;
        }

        double costoTotal = costeBase + costeNata + costePersonalizacion;

        System.out.println("Resumen del presupuesto:");
        System.out.println(
                "Tarta de " + sabor + ": " + costeBase + " euros");

        if (costeNata != 0) {
            System.out.println("Nata: " + costeNata + " euros");
        }

        if (costePersonalizacion != 0) {

            System.out.println("Personalización: " + costePersonalizacion + " euros");
        }

        System.out.println("Coste total: " + costoTotal + " euros");
    }

    public static void conElseIf() {

        System.out.println("Bienvenido a la pastelería. ¿De qué sabor desea la tarta?");
        System.out.println("1. Manzana (18 euros)");
        System.out.println("2. Fresa (16 euros)");
        System.out.println("3. Chocolate Negro (14 euros)");
        System.out.println("4. Chocolate Blanco (15 euros)");

        int opcionSabor = scanner.nextInt();

        double costeBase = 0;
        String sabor = "";

        if (opcionSabor == 1) {
            costeBase = 18;
            sabor = "Manzana";

        } else if (opcionSabor == 2) {
            costeBase = 16;
            sabor = "Fresa";

        } else if (opcionSabor == 3) {
            costeBase = 14;
            sabor = "Chocolate Negro";

        } else if (opcionSabor == 4) {
            costeBase = 15;
            sabor = "Chocolate Blanco";

        } else {
            System.out.println("Opción no válida. Tendrás que volver a empezar.");
        }

        if (costeBase != 0) {
            double costeNata = 0;
            double costePersonalizacion = 0;

            System.out.println("¿Desea añadir nata? (s/n)");
            String opcionNata = scanner.next();
            if (opcionNata.equalsIgnoreCase("s")) {
                costeNata = 2.50;
            }

            System.out.println("¿Desea personalizar con un nombre? (s/n)");
            String opcionPersonalizacion = scanner.next();
            if (opcionPersonalizacion.equalsIgnoreCase("s")) {
                costePersonalizacion = 2.75;
            }

            double costoTotal = costeBase + costeNata + costePersonalizacion;

            System.out.println("Resumen del presupuesto:");
            System.out.println(
                    "Tarta de " + sabor + ": " + costeBase + " euros");

            if (costeNata != 0) {
                System.out.println("Nata: " + costeNata + " euros");
            }

            if (costePersonalizacion != 0) {
                System.out.println("Personalización: " + costePersonalizacion + " euros");
            }

            System.out.println("Coste total: " + costoTotal + " euros");
        }
    }
}
