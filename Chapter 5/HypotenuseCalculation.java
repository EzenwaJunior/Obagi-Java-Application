public class HypotenuseCalculation {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;

        double hypotenuse = calculateHypotenuse(side1, side2);
        System.out.println("The hypotenuse is: " + hypotenuse);
    }

    public static double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
