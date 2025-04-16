public class CircleArea {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
