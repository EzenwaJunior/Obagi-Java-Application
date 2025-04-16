import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Healthcare", "Vacations"};
        double totalExpenses = 0;

        for (String category : categories) {
            System.out.print("Enter expense for " + category + ": ");
            totalExpenses += input.nextDouble();
        }

        double fairTax = totalExpenses * 0.23;
        System.out.printf("Estimated FairTax: $%.2f%n", fairTax);
    }
}
