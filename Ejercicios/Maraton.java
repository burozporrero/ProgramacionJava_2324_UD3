package Ejercicios;

import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = lector.nextInt();

        System.out.println("Has participado anteriormente en alguna maraton? (si / no):");
        String participacion = lector.next();

        if (edad >= 18 && participacion.equalsIgnoreCase("si")) {
            System.out.println("Tiempo en acabar la ultima maraton realizada (en minutos):");
            int minutos = lector.nextInt();

            if ((edad < 35 && minutos < 190) || (edad >= 35 && minutos < 225)){
                System.out.println("Persona seleccionada");
            } else {
                System.out.println("Persona no seleccionada");
            }

        } else {
            System.out.println("No puedes participar");
        }
        lector.close();
    }
}
