package operators;

public class OperatorLogic {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(a || b && !a);
    }
}
