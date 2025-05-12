// 6.12 (Duplicate Elimination)
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number (10–100): ");
            int number = input.nextInt();

            boolean duplicate = false;
            for (int i = 0; i < count; i++) {
                if (unique[i] == number) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate && number >= 10 && number <= 100) {
                unique[count++] = number;
                for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
                System.out.println();
            }
        }
    }
}
