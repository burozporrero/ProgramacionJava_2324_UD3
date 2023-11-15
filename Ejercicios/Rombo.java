package Ejercicios;

import java.util.Scanner;

/**
 * @author DFR 1DAM 23-24
 */
public class Rombo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduzca el número de líneas desde el inicio hasta la mitad del rombo: ");
        int eje = scn.nextInt();

        /*
        Tal y como está declarado el rombo en el ejercicio, la línea
        central constará de n * 2 - 1 almohadillas, que también es el
        número total de líneas. Así, n es la posición central tanto de
        forma horizontal como vertical: el eje del rombo.
        */

        int clave = eje * 2 - 1;

        // Esta función construye la pirámide

        for (int fil = 0; fil < eje; fil++) {

            for (int col = 1; col <= clave; col++) {

                if ((col < (eje - fil)) || (col > (eje + fil))) {
                    System.out.print(" ");
                } else {
                    System.out.print("@");
                }
            }

            System.out.println();
        }

        // La siguiente función construye el resto del rombo

        for (int fil = (eje - 2); fil >= 0; fil--) {

            for (int col2 = 1; col2 <= clave; col2++) {

                if ((col2 < (eje - fil)) || (col2 > (eje + fil))) {
                    System.out.print(" ");
                } else {
                    System.out.print("@");
                }
            }

            System.out.println();
        }
        scn.close();
    }
}
