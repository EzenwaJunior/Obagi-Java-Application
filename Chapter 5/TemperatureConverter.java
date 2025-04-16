public class TemperatureConverter {

    public static double celsius(double f) {
        return 5.0 / 9.0 * (f - 32);
    }

    public static double fahrenheit(double c) {
        return 9.0 / 5.0 * c + 32;
    }

    public static void main(String[] args) {
        double f = 98.6;
        double c = 37.0;

        System.out.println(f + "°F in Celsius is: " + celsius(f));
        System.out.println(c + "°C in Fahrenheit is: " + fahrenheit(c));
    }
}
