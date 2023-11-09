package EjerciciosSwitch;

public class Mes {
    public static void main(String[] args) {
        solucion1();
        solucion2();
    }

    public static void solucion1() {

        System.out.print("Introduzca el número de mes del que desea conocer su nombre: ");

        String mesInput = System.console().readLine();
        int mes = Integer.parseInt(mesInput);

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;

            case 2:
                System.out.println("Febrero");
                break;

            case 3:
                System.out.println("Marzo");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Mayo");
                break;

            case 6:
                System.out.println("Junio");
                break;

            case 7:
                System.out.println("Julio");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Septiembre");
                break;

            case 10:
                System.out.println("Octubre");
                break;

            case 11:
                System.out.println("Noviembre");
                break;

            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Introduzca un mes válido.");
                break;
        }
    }

    public static void solucion2() {
        System.out.print("Por favor, introduzca un numero de mes: ");
        int mes = Integer.parseInt(System.console().readLine());
        String nombreDelMes =
                switch (mes) {
                    case 1 -> "enero";
                    case 2 -> "febrero";
                    case 3 -> "marzo";
                    case 4 -> "abril";
                    case 5 -> "mayo";
                    case 6 -> "junio";
                    case 7 -> "julio";
                    case 8 -> "agosto";
                    case 9 -> "septiembre";
                    case 10 -> "octubre";
                    case 11 -> "noviembre";
                    case 12 -> "diciembre";
                    default -> "no existe ese mes";
                };
        System.out.println("EjerciciosSwitch.Mes " + mes + ": " + nombreDelMes);
    }
}
