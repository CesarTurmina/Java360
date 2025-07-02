package initial;

import java.util.Scanner;

public class ExNameNumber {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

//        for ( int i = 0; i < valor; i++) {
//            System.out.println(name);
//        }

        int i = 0;
        while (i<valor) {
            System.out.println(name);
            i++;
        }

    }
}
