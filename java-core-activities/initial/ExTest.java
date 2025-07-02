package initial;

public class ExTest {

    public static int somar(int val1, int val2, int val3) {

        int resultado = val1+val2+val3;
        return resultado;
    }

    public static void main(String[] args) {

        int resp = somar(10,20,30);
        resp = somar(resp,50,100);
        System.out.println("Resp: " + resp);


    }
}
