public class CodeFix {
    public static void main(String[] args) {
        // Loop increments instead of decrements
        for (int i = 19; i >= 1; i -= 2)
            System.out.println(i);
    }
}
