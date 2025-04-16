public class TotalNotInitialized {
    public static void main(String[] args) {
        int x = 1, total = 0/*Total was not initialized*/;

        while (x <= 10) {
            total += x;
            ++x;
        }
		
        System.out.println("The total sum of numbers from 1 to 10 is: " + total);
    }
}
