import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secret = 1 + rand.nextInt(1000); // Random number from 1 to 1000

        System.out.println("Guess a number between 1 and 1000:");

        while (true) {
            int guess = input.nextInt();

            if (guess < secret)
                System.out.println("Too low. Try again.");
            else if (guess > secret)
                System.out.println("Too high. Try again.");
            else {
                System.out.println("Congratulations. You guessed the number!");
                break;
            }
        }
    }
}
