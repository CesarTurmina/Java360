package selection;

public class VariableScope {

    public static void main(String[] args) {

        int a = 12;
        int b;

        if (a == 10) {
            b = 15;
        }else {
            b = 20;
        }

        System.out.println(b);
    }
}
