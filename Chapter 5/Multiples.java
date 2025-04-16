public class Multiples {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;

        boolean result = isMultiple(a, b);
        System.out.println(b + " is a multiple of " + a + ": " + result);
    }

    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }
}
