package variable;

public class NumberRepresentation {

    public static void main(String[] args){

        long a = 20_000_000_000L;
        double b = 345.1234553;

        int c = 0b1010_1111_0101;

        System.out.println(c);

        int d = 0x9af_1455;
        System.out.println(d);

        int e = 0444;
        System.out.println(e);
    }
}
