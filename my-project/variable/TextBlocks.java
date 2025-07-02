package variable;

import java.sql.SQLOutput;

public class TextBlocks {
    public static void main(String[] args) {
        System.out.println("Olá, \n tudo\n     bem");

        String s =
                """
                Olá    veja bem
                    Tudo
                        Bem
                """;
        System.out.println(s);
    }
}
