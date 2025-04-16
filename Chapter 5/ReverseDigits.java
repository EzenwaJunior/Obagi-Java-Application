public class ReverseDigits {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = reverse(number);
        System.out.println("The reverse of " + number + " is " + result);
    }
}
