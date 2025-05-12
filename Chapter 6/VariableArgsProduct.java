// 6.14 (Variable-Length Argument List)
public class VariableArgsProduct {
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3));
        System.out.println(product(1, 2, 3, 4));
        System.out.println(product(5));
    }
}