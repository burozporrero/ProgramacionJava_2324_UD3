package EjerciciosSwitch;

public class TEORIA_TiposSwitch {
    public static void main(String[] args) {

        diaSemanaTexto();
        diaSemanaNumerico();

    }

    public static void diaSemanaTexto() {

        String day = "martes";

        // Switch Statement
        // - Cada case por separado
        // - Haciendo un control "ignore case"
        // - Siempre se pone el break
        String dayType;
        switch (day.toUpperCase()) {
            case "LUNES":
                dayType = "Día laborable";
                break;
            case "MARTES":
                dayType = "Día laborable";
                break;
            case "MIERCOLES":
                dayType = "Día laborable";
                break;
            case "JUEVES":
                dayType = "Día laborable";
                break;
            case "VIERNES":
                dayType = "Día laborable";
                break;
            case "SABADO":
                dayType = "Día no laborable";
                break;
            case "DOMINGO":
                dayType = "Día no laborable";
                break;
            default:
                dayType = "Día no válido";
                break;
        }
        System.out.println("El " + day + " es un " + dayType);

        // Switch Statement
        // - Agrupando cases
        // - Haciendo un control "ignore case"
        // - Siempre se pone el break
        switch (day.toUpperCase()) {
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES":
                dayType = "Día laborable";
                break;
            case "SABADO", "DOMINGO":
                dayType = "Día no laborable";
                break;
            default:
                dayType = "Día no válido";
                break;
        }
        System.out.println("El " + day + " es un " + dayType);

        // Switch Expression
        // - Cada case por separado
        // - Haciendo un control "ignore case"
        // - NO se usa el break
        // - Se puede poner resultado asignado directamente a una variable
        dayType = switch (day.toUpperCase()) {
            case "LUNES" -> "Día laborable";
            case "MARTES" -> "Día laborable";
            case "MIERCOLES" -> "Día laborable";
            case "JUEVES" -> "Día laborable";
            case "VIERNES" -> "Día laborable";
            case "SABADO" -> "Día no laborable";
            case "DOMINGO" -> "Día no laborable";
            default -> "Día no válido";
        };
        System.out.println("El " + day + " es un " + dayType);

        // Switch Expression
        // - Agrupa cases
        // - Haciendo un control "ignore case"
        // - NO se usa el break
        // - Se puede poner resultado asignado directamente a una variable
        dayType = switch (day.toUpperCase()) {
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> "Día laborable";
            case "SABADO", "DOMINGO" -> "Día no laborable";
            default -> "Día no válido";
        };
        System.out.println("El " + day + " es un " + dayType);
    }

    public static void diaSemanaNumerico() {
        int day = 1;
        String textDay;

        // Switch Expression
        // - Con más de una instrucción por case
        // - No se usa el break;
        switch (day) {
            case 1 -> {
                textDay = "LUNES";
                System.out.println(textDay + " Día laborable");
            }
            case 2 -> {
                textDay = "MARTES";
                System.out.println(textDay + " Día laborable");
            }
            case 3 -> {
                textDay = "MIERCOLES";
                System.out.println(textDay + " Día laborable");
            }
            case 4 -> {
                textDay = "JUEVES";
                System.out.println(textDay + " Día laborable");
            }
            case 5 -> {
                textDay = "VIERNES";
                System.out.println(textDay + " Día laborable");
            }
            case 6 -> {
                textDay = "SABADO";
                System.out.println(textDay + " Día laborable");
            }
            case 7 -> {
                textDay = "DOMINGO";
                System.out.println(textDay + " Día laborable");
            }
            default -> System.out.println("Día no válido");
        }
    }
}
