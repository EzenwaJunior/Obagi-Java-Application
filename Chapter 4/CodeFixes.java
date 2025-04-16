public class CodeFixes {
    public static void main(String[] args) {
        // Define the value variable
        int value = 5; // You can change this value to test different cases

        // Switch statement to check if the integer is even or odd
        switch (value % 2) {
            case 0:
                System.out.println("Even integer");
                break;  // Break statement is added
            case 1:
                System.out.println("Odd integer");
                break;  // Break statement is added
        }
    }
}
