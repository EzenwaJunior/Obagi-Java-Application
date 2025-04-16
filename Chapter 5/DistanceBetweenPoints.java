public class DistanceBetweenPoints {
    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        double result = distance(x1, y1, x2, y2);
        System.out.println("The distance between the points is: " + result);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
