package repetition;

public class RepeatContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 200; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("FIM");
    }
}
