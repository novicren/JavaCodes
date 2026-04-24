import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choose: " + computerChoice);

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            if (playerChoice.equals(computerChoice)) {
                System.out.println("Its a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer win!");
            }
            System.out.print("Play again? (yes / no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if (playAgain.equals("no")) {
                System.out.println("Exiting...");
                break;
            }
        } while (playAgain.equals("yes"));

        scanner.close();
    }
}
