import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalAttempts = 0;
        boolean playAgain = true;

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            final int maxAttempts = 10;

            System.out.println("\nRound " + (rounds + 1));
            while (attempts < maxAttempts) {
                System.out.print("Guess the number (between 1 and 100): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber);
            }

            totalAttempts += attempts;
            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Average attempts per round: " + (double) totalAttempts / rounds);

        scanner.close();
    }
}

