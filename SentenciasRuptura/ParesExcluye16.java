package SentenciasRuptura;

public class ParesExcluye16 {

    public static void main(String[] args) {
        for (int i = 10; i <= 20; i += 2) {
            if (i == 16)
                continue;
            System.out.println(i);
        }

        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 1)
                continue;
            if (i == 16)
                continue;

            System.out.println(i);
        }

        for (int i = 10;; i += 2) {
            if (i == 16)
                continue;
            if (i > 20)
                break;

            System.out.println(i);

        }
    }
}
