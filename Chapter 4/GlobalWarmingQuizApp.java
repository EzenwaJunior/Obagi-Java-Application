import java.util.Scanner;

public class GlobalWarmingQuizApp {

    public static void main(String[] args) {
        // Declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        // Question 1
        System.out.println("1. What is the main cause of global warming?");
        System.out.println("a) Increased carbon dioxide (CO2) emissions");
        System.out.println("b) Solar flares");
        System.out.println("c) Increased volcanic activity");
        System.out.print("Enter your answer (a, b, or c): ");
        char answer1 = scanner.next().charAt(0);
        if (answer1 == 'a' || answer1 == 'A') {
            correctAnswers++;
        }

        // Question 2
        System.out.println("\n2. What is the greenhouse effect?");
        System.out.println("a) The process by which greenhouse gases trap heat in the atmosphere");
        System.out.println("b) The process by which plants grow");
        System.out.println("c) The process of ozone depletion");
        System.out.print("Enter your answer (a, b, or c): ");
        char answer2 = scanner.next().charAt(0);
        if (answer2 == 'a' || answer2 == 'A') {
            correctAnswers++;
        }

        // Question 3
        System.out.println("\n3. Which of the following gases is a major greenhouse gas?");
        System.out.println("a) Nitrogen");
        System.out.println("b) Oxygen");
        System.out.println("c) Methane");
        System.out.print("Enter your answer (a, b, or c): ");
        char answer3 = scanner.next().charAt(0);
        if (answer3 == 'c' || answer3 == 'C') {
            correctAnswers++;
        }

        // Question 4
        System.out.println("\n4. Which human activity contributes most to global warming?");
        System.out.println("a) Deforestation");
        System.out.println("b) Industrialization and fossil fuel burning");
        System.out.println("c) Natural gas extraction");
        System.out.print("Enter your answer (a, b, or c): ");
        char answer4 = scanner.next().charAt(0);
        if (answer4 == 'b' || answer4 == 'B') {
            correctAnswers++;
        }

        // Question 5
        System.out.println("\n5. Which of the following is a consequence of global warming?");
        System.out.println("a) Rising sea levels");
        System.out.println("b) Decreased storm activity");
        System.out.println("c) Decreased rainfall");
        System.out.print("Enter your answer (a, b, or c): ");
        char answer5 = scanner.next().charAt(0);
        if (answer5 == 'a' || answer5 == 'A') {
            correctAnswers++;
        }

        // Display result
        System.out.println("\nQuiz Over!");
        System.out.println("You got " + correctAnswers + " out of 5 correct.");

        // Feedback based on correct answers
        if (correctAnswers == 5) {
            System.out.println("Excellent! You're a global warming expert!");
        } else if (correctAnswers >= 3) {
            System.out.println("Good job! You have a solid understanding of global warming.");
        } else {
            System.out.println("You might want to read more about global warming. Keep learning!");
        }
    }
}
