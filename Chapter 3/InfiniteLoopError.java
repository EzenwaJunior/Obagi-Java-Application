public class InfiniteLoopError {
    public static void main(String[] args) {
        int y = 10; 

        while (y > 0) {
            System.out.println(y);
            --y; // Decrement y to avoid infinite loop
        }
    }
}