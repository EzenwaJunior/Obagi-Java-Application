public class MinOfThree {

    public static double minimum3(double x, double y, double z) {
        return Math.min(x, Math.min(y, z));
    }

    public static void main(String[] args) {
        double a = 5.4, b = 3.2, c = 7.9;
        double min = minimum3(a, b, c);
        System.out.println("The minimum of " + a + ", " + b + ", and " + c + " is: " + min);
    }
}
