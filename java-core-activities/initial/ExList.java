package initial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExList {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        ArrayList<Integer> lista =
                new ArrayList<Integer>(Arrays.asList(-5, -3, 0, 10, 20, 30));
        ArrayList<String> nomes =
                new ArrayList<String>(Arrays.asList("Mario", "Pedro", "Maria"));

        int positivo = 0, negativo = 0, zeros = 0;
        for (int num : lista ) {
            if (num > 0) {
                positivo++;
            }else if(num < 0) {
                negativo++;
            }else {
                zeros++;
            }
        }
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Zeros: " + zeros);

    }
}
