package Ejercicios;
/*
Escriu un programa que visualitza les quantitats necess�ries per a realitzar una recepta.
Llig de teclat per a quantes persones �s la recepta. Si s�introdueix un valor inferior a 1,
llavors es calcula les quantitats per a una persona.
La recepta per a sis persones t�: 600gr de coliflor, 1 ceba tendra, 3 carlotes, 500gr de pit
de pollastre, 25gr de pinyons, 75gr de panses, 220ml de caldo i 1.5 culleretes de curri.
Tin en compte que, les carlotes, sempre, s�n senceres, i com a m�nim en la recepta hi ha
mitja ceba tendra, una carlota, 10gr de pinyons, 20gr de panses i 0.5 culleretes de curri.

visualitza les quantitats necess�ries per a realitzar una recepta
Llig de teclat per a quantes persones �s la recepta
      Si s�introdueix un valor inferior a 1, llavors es calcula les quantitats per a una persona.


 */

import java.util.Scanner;

public class Receta {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        solucion1();
        solucion2();
        entrada.close();
    }

    /**
     * @author DFR 1DAM 23-24
     */
    public static void solucion1() {
        final int COLIFLOR = 100;
        final double CEBOLLETAS = 1 / 6d;
        final double ZANAHORIAS = 3 / 6d;
        final double POLLO = 500 / 6d;
        final double PINYONES = 25 / 6d;
        final double PASAS = 75 / 6d;
        final double CALDO = 220 / 6d;
        final double CURRY = 1.5 / 6d;

        System.out.println("Indique para cuántas personas será la receta: ");
        int comensales = entrada.nextInt();
        if (comensales < 1) {
            comensales = 1;
        }

        System.out.printf("Para %d personas, las cantidades de ingredientes son las siguientes: \n", comensales);
        System.out.printf("-%d gr de coliflor\n", COLIFLOR * comensales);
        System.out.printf("-%.1f cebolletas\n", Math.max(0.5, CEBOLLETAS * comensales));
        System.out.printf("-%.0f zanahorias\n", Math.ceil(Math.max(1.0, ZANAHORIAS * comensales)));
        System.out.printf("-%d gr de pechuga de pollo\n", (int)(POLLO * comensales));
        System.out.printf("-%d gr de piñones\n", Math.max(10, (int)(PINYONES * comensales)));
        System.out.printf("-%d gr de pasas\n", Math.max(20, (int)(PASAS * comensales)));
        System.out.printf("-%d ml de caldo\n", (int)(comensales* CALDO));
        System.out.printf("-%.1f cucharaditas de curry\n", Math.max(0.5, CURRY * comensales));
    }

    /**
     * @author Eduard
     */
    public static void solucion2() {

        System.out.println("Entra el nombre de personas");
        int nPersones = entrada.nextInt();

        nPersones = Math.max(nPersones, 1);

        int coliflor = 600 * nPersones / 6;
        int pitPollastre = 500 * nPersones / 6;
        int caldo = 220 * nPersones / 6;
        double ceba = 1.0 * nPersones / 6;
        if (ceba < 0.5) {
            ceba = .5;
        }
        int pinyons = 25 * nPersones / 6;
        pinyons = Math.max(pinyons, 10);
        int panses = 75 * nPersones / 6;
        panses = Math.max(panses, 20);
        double curry = 1.5 * nPersones / 6;
        curry = Math.max(curry, .5);
        int carlotes = (int) Math.ceil(3.0 * nPersones / 6);
        System.out.printf("""
                        Pollastre al curry per a %d persones
                        pit de pollastre %d gr
                        coliflor %d gr
                        carlotess %d\s
                        pinyons %d gr
                        panses %d gr
                        caldo %d ml
                        ceba %.1f\s
                        curry %.1f culleretes
                        """,
                nPersones, pitPollastre, coliflor, carlotes, pinyons, panses,
                caldo, ceba, curry);
    }

}
