package EjerciciosBucles;
public class Sumatorio {
    public static void main(String[] args){
        conWhile();
        conDoWhile();
        conFor();
    }

    public static void conWhile(){
        
        int total = 0;
        int num = 1;

        while(num <= 10){
            total = total + num;
            ++num;
        }

        System.out.println("Bucle While: " + total);
    }

    public static void conDoWhile(){

        int total = 0;
        int num = 1;

        do{
            total = total + num;
            ++num;
        } while(num <= 10);

        System.out.println("Bucle Do While: " + total);
    }

    public static void conFor(){
        
        int total = 0;

        for(int num = 1; num <= 10; ++num){
            total = total + num;
        }

        System.out.println("Bucle con for: " + total);
    }
}
