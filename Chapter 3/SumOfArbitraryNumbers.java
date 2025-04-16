import java.util.Scanner;

public class SumOfArbitraryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, total = 0;
        System.out.println("Enter positive numbers to sum (enter 0 or a negative number to stop):");

        while ((num = scanner.nextInt()) > 0) {
            total += num;
        }

        System.out.println("The total sum is: " + total);
    }
}
