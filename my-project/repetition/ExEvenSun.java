package repetition;

public class ExEvenSun {

    public static void main(String[] args) {

        int sun = 0;
        for (int i = 0; i <= 100; i++) {
            sun += i % 2 == 0 ? i : 0;
            }
        System.out.println(sun);
    }
}
