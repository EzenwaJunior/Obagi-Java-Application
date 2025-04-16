public class InfiniteLoopError {
    public static void main(String[] args) {
        for (double k = 0.1; k <= 1.0; k += 0.1) {
            System.out.println(k);
        }
    }
}