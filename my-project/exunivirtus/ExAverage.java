package exunivirtus;

import java.util.Scanner;

public class ExAverage {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        double nota1 = 5;

        double nota2 = 5;

        double nota3 = 5;

        double result = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f", result);

        scanner.close();
    }
}
