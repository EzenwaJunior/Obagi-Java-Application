public class AcceptAndMultiplyNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOf4_6 = 0; 
        int sumOf5_9 = 0; 

        for (int i = 4; i <= 6; i++) {
            sumOf4_6 += numbers[i];
        }

        for (int i = 5; i <= 9; i++) {
            sumOf5_9 += numbers[i];
        }

        int result = sumOf4_6 * sumOf5_9;
        System.out.printf("The result is %d%n", result);

        if (result % 2 == 0) {
            System.out.println("The result is even.");
        }
    }
}
