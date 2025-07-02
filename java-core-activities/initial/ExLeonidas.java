package initial;

import java.util.Random;
import java.util.Scanner;

public class ExLeonidas {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        int palpite, resposta;

        System.out.println("Digite seu palpite: ");
        palpite = scanner.nextInt();
        Random sorteio = new Random();
        resposta = sorteio.nextInt(0, 5000);

        while (palpite != resposta) {
            if (palpite < resposta) {
                System.out.println("Um pouco mais...");
            } else {
                System.out.println("Um pouco menos...");
            }
            System.out.println("Digite outro palpite:");
            palpite = scanner.nextInt();
        }
        System.out.println("Parabéns! A resposta é: " + resposta);
    }
}

