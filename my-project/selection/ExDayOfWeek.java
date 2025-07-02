package selection;

public class ExDayOfWeek {

    public static void main(String[] args) {
        int n = 12;

        String dow = switch (n) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Invalido";
        };

        System.out.println(dow);
    }
}
