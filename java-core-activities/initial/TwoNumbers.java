package initial;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

            int valor;
            valor = scanner.nextInt();

            if ( valor < 0){
                System.out.println("Seu numero é negativo");
        } else if (valor == 0) {
                System.out.println("Seu numero é 0");
        } else if (valor > 0) {
                System.out.println("Seu numero é positivo");
            } else {
                System.out.println("Teste");
        }
    }
}
