public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1_000_000_000;
        int monthsTo1_5B = 0, monthsTo2B = 0;

        // 1.5B
        double current = users;
        while (current < 1_500_000_000) {
            current *= 1.04;
            monthsTo1_5B++;
        }

        // 2B
        current = users;
        while (current < 2_000_000_000) {
            current *= 1.04;
            monthsTo2B++;
        }

        System.out.println("Months to reach 1.5 billion: " + monthsTo1_5B);
        System.out.println("Months to reach 2 billion: " + monthsTo2B);
    }
}
