public class Exponentiation {
    public static void main(String[] args) {
        int base = 2;        // Example base
        int exponent = 3;    // Example exponent

        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
