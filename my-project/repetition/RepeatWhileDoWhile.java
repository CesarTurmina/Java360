package repetition;

public class RepeatWhileDoWhile {

    public static void main(String[] args) {

        int n = 0;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
        System.out.println("FIM");

        System.out.println("DO...WHILE");
        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
