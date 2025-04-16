public class SemiColonError {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println("Current value of i: " + i);  // Print the value of i during each iteration
            ++i;  // Increment i
        }
    }
}
