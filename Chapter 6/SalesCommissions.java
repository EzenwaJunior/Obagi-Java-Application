// 6.10 (Sales Commissions)
import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] salaryRanges = new int[9]; // Indexes for $200–299 to $1000+

        System.out.print("Enter number of salespeople: ");
        int numSalespeople = input.nextInt();

        for (int i = 0; i < numSalespeople; i++) {
            System.out.printf("Enter gross sales for salesperson %d: ", i + 1);
            double grossSales = input.nextDouble();

            int salary = 200 + (int)(grossSales * 0.09); // Truncate to int

            if (salary >= 1000) {
                salaryRanges[8]++;
            } else {
                int index = (salary - 200) / 100;
                if (index >= 0 && index < 8) {
                    salaryRanges[index]++;
                }
            }
        }

        System.out.println("\nSalary Ranges:");
        String[] labels = {
            "$200–299", "$300–399", "$400–499", "$500–599", "$600–699",
            "$700–799", "$800–899", "$900–999", "$1000 and over"
        };

        for (int i = 0; i < salaryRanges.length; i++) {
            System.out.printf("%-15s: %d\n", labels[i], salaryRanges[i]);
        }
    }
}