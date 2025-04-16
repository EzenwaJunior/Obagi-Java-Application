public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int n = 1; // Initialize the variable 'n' with a value, such as 1

        switch (n) {
            case 1:
                System.out.println("The number is 1");
                break; // Add break to prevent fall-through
            case 2:
                System.out.println("The number is 2");
                break; // Break to terminate the switch block
            default:
                System.out.println("The number is not 1 or 2");
                break; // Optional, but good practice to include
        }
    }
}
