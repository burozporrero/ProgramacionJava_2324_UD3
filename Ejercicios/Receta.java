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
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Receta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.UK);
        System.out.println("Entra el nombre de personas");
        int nPersones = entrada.nextInt();
        nPersones = nPersones < 1 ? 1 : nPersones;
        int coliflor = 600 * nPersones / 6;
        int pitPollastre = 500 * nPersones / 6;
        int caldo = 220 * nPersones / 6;
        double ceba = 1.0 * nPersones / 6;
        if (ceba < 0.5) {
            ceba = .5;
        }
        int pinyons = 25 * nPersones / 6;
        pinyons = pinyons < 10 ? 10 : pinyons;
        int panses = 75 * nPersones / 6;
        panses = panses < 20 ? 20 : panses;
        double curry = 1.5 * nPersones / 6;
        curry = curry < .5 ? .5 : curry;
        int carlotes = (int) Math.ceil(3.0 * nPersones / 6);
        System.out.printf("Pollastre al curry per a %d persones\n"
                + "pit de pollastre %d gr\ncoliflor %d gr\ncarlotess %d \npinyons %d gr\n"
                + "panses %d gr\ncaldo %d ml\nceba %.1f \ncurry %.1f culleretes\n",
                nPersones, pitPollastre, coliflor, carlotes, pinyons, panses,
                caldo, ceba, curry);

    }

}
