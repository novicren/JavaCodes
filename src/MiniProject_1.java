import java.util.Scanner;

public class MiniProject_1 {
    public static void main(String[] args) {

        // generate a random number between 1 -100 that the user have to guess.

        int random = (int) (Math.random() * 100); // random number between 1 - 100

        System.out.println("Guess the Number between 1-100 (Enter -1 to Exit)");
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter your Guess: ");
            num = sc.nextInt(); // user input

            if (num == random) {
                System.out.println("Correct Guess!");
                break;
            } else if (num > random)
                System.out.println("Your Number is Larger");
            else
                System.out.println("Your Number is Smaller");
        } while (num != -1);

        System.out.println("The Number was " + random);
    }
}
