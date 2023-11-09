package EjerciciosSwitch;

public class OrganizadorAnimales {
    public static void main(String[] args) {
        System.out.println(
                "Por favor, introduzca un animal de entre los siguientes: cat, dog, lion, cow, tiger."
        );
        String animal = System.console().readLine();
        String tipo =
                switch (animal) {
                    case "cat", "dog", "cow" -> "Animal domestico";
                    case "lion", "tiger" -> "Animal salvaje";
                    default -> "No existe ese animal en la lista";
                };
        System.out.println(tipo);
    }
}
