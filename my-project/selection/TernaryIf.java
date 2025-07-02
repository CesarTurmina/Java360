package selection;

public class TernaryIf {

    public static void main(String[] args) {

        int age= 19;
//        String text;
//
//        if (age >= 18) {
//            text = "Maior de Idade";
//        } else {
//            text = "Menor de Idade";
//        }

        String text = age >= 18 ? "Maior de Idade" : "Menor de Idade";
        System.out.println(text);
    }
}
