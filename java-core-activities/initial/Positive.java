package initial;

public class Positive {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um numero: ");
        int value = scanner.nextInt();

        if(value > 0) {
            System.out.println("Seu numero é positivo.");
        } else if (value == 0) {
            System.out.println("Seu numero é 0.");
        } else {
            System.out.println("Seu numero é negativo.");
        }
        scanner.close();
    }
}
