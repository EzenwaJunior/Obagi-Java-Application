// 6.11 (Array Operations)
public class ArrayOperations {
    public static void main(String[] args) {
        int[] counts = new int[10];
        int[] bonus = new int[15];
        int[] bestScores = {85, 90, 78, 92, 88};

        // a) Set to zero
        for (int i = 0; i < counts.length; i++) counts[i] = 0;

        // b) Add one
        for (int i = 0; i < bonus.length; i++) bonus[i]++;

        // c) Display
        for (int score : bestScores) System.out.printf("%d\n", score);
    }
}