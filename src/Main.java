import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cup cup = new Cup(getInt("Hvor mange terninger vil du have?"));

        boolean active = true;
        while (active) {
            switch (getString("\nHvad ønsker du?" + "\n 1. Vis slag \n 2. Rul terninger \n 3. Sorter rul \n 4. Fjern et tal \n 5. Vis fjernede \n 6. afslut")) {
                case "1" -> cup.showAllDice();
                case "2" -> cup.rollAllDice();
                case "3" -> cup.sortDices();
                case "4" -> cup.removeDice(getInt("Hvilket tal vil du fjerne?"));
                case "5" -> cup.showRemoved();
                case "6" -> active = false;
                default -> System.out.println("Prøv igen");
            }
        }





    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    }

    public static int getInt(String s) {

        while (true) {
            try {
                int i = Integer.parseInt(getString(s));
                return i;
            } catch (NumberFormatException e) {
                System.out.println("kun tal");

            }
        }
    }

}