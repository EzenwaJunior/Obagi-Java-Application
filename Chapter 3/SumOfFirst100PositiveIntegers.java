public class SumOfFirst100PositiveIntegers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the first 100 positive integers is: " + sum);
    }
}
