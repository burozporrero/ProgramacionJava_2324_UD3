package EjerciciosBucles;
public class TablasMultiplicar {
    public static void main(String[] args) {
        conFor();
        conWhile();
    }
    public static void conFor() {

        for (int i = 1 ; i < 11 ; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1 ; j < 11 ; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public static void conWhile() {
        int multiplicando = 0;
        int multiplicador;

        while (multiplicando <= 10) {
            multiplicador = 1;

            System.out.println(" ");
            System.out.println("La tabla del " + multiplicando);

            while (multiplicador <= 10) {
                int producto = multiplicando * multiplicador;

                System.out.println(multiplicando + " * " + multiplicador + " = " + producto);

                multiplicador++;
            }
            multiplicando++;
        }
    }
}
