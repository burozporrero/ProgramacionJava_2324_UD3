package SentenciasRuptura;

import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        while (true) {

            int entrada = scanner.nextInt();
            if (entrada == 0) {
                break;
            } else if (entrada % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd €");
            }
        }

        scanner.close();
    }

}
