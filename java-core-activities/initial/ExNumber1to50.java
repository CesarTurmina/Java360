package initial;


public class ExNumber1to50 {

    public static void main(String[] args) {
        //Somar valores entre 1 e 50

//        int soma = 0;
//        for (int i = 1; i <= 50; i++) {
//            soma += i;
//            System.out.println(soma);
//        }
//        System.out.println("O resultado foi: " + soma);

        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.println(soma);
            }
        }
        System.out.println("O resultado foi: " + soma);
    }
}