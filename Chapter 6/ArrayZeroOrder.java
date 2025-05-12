// 6.13 (Array Zeroing Order)
public class ArrayZeroOrder {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];
        int counter = 1;
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0; // zeroing order: row-major
                System.out.printf("Setting sales[%d][%d] to 0 (Step %d)\n", row, col, counter++);
            }
        }
    }
}