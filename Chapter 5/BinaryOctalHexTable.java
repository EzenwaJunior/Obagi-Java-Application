public class BinaryOctalHexTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%d\t%s\t%o\t%X%n", i, Integer.toBinaryString(i), i, i);
        }
    }
}
