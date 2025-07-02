package variable;

public class ExplictCasting {

    public static void main(String[] args) {

        double d = 240.56;
        int i = (int)d;

        System.out.println(d);
        System.out.println(i);

        long l = 300000000000L;
        int l2 = (int)l;

        System.out.println(l);
        System.out.println(l2);

        long i2 = 10;
        int i3 = (int)i2;

        System.out.println(i2);
        System.out.println(i3);
    }
}
