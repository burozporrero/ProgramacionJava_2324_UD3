package Ejercicios;

import java.util.Scanner;

public class Rombo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("entra la fila central del rombre");
        int filaCentral = Math.abs(scn.nextInt());

        String rombe = creaRombe(filaCentral);

        System.out.println(rombe);
    }

    private static String creaRombe(int filaCentral) {

        String rombe = "";
        int numEspacios = filaCentral - 1;
        int numX = 1;
        int files = filaCentral * 2;

        for (int fila = 1; fila < files; fila++) {
            rombe += getLiniaDe(numEspacios, ' ');
            rombe += getLiniaDe(numX, 'X');
            rombe += "\n";

            // System.out.println("Fila:" + fila + " numEspacios: " + numEspacios + " numX:
            // " + numX);

            if (fila < filaCentral) {
                numEspacios--;
                numX += 2;
            } else {
                numEspacios++;
                numX -= 2;
            }
        }

        return rombe;
    }

    private static String getLiniaDe(int huecos, char caracter) {

        String linea = "";

        for (int i = 0; i < huecos; i++) {
            linea += caracter;
        }
        return linea;
    }

}
