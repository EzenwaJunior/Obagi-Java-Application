import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter beginning balance: ");
        int balance = input.nextInt();
        System.out.print("Enter total charges: ");
        int charges = input.nextInt();
        System.out.print("Enter total credits: ");
        int credits = input.nextInt();
        System.out.print("Enter credit limit: ");
        int creditLimit = input.nextInt();

        // Validate inputs (no negative charges or credits)
        if (charges < 0 || credits < 0) {
            System.out.println("Charges and credits cannot be negative.");
            return;  // Exit if invalid input is found
        }

        int newBalance = balance + charges - credits;
        System.out.println("New balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded.");
        }
    }
}
