import java.util.Random;
import java.util.Scanner;

public class DiceRollingProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;
        int roll;

        System.out.print("Enter number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                roll = random.nextInt(1, 7);
                System.out.println("you rolled: " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice should be greater than 0");
        }

        // DISPLAY ASCII OF DICE
        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -----------
                |           |
                |     ●     |
                |           |
                 -----------
                """;

        String dice2 = """
                 -----------
                | ●         |
                |           |
                |         ● |
                 -----------
                """;

        String dice3 = """
                 -----------
                | ●         |
                |     ●     |
                |         ● |
                 -----------
                """;

        String dice4 = """
                 -----------
                | ●       ● |
                |           |
                | ●       ● |
                 -----------
                """;

        String dice5 = """
                 -----------
                | ●       ● |
                |     ●     |
                | ●       ● |
                 -----------
                """;

        String dice6 = """
                 -----------
                | ●       ● |
                | ●       ● |
                | ●       ● |
                 -----------
                """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Not dice");
        }
    }
}
