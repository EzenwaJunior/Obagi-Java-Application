import java.util.Scanner;
import java.util.Random;

public class GuessWithFeedback {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1; // random number between 1 and 100
        int count = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            count++;
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

        if (count < 10)
            System.out.println("Either you know the secret or you got lucky!");
        else if (count == 10)
            System.out.println("Aha! You know the secret!");
        else
            System.out.println("You should be able to do better!");
    }
}
