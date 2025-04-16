public class SemiColonError {
    public static void main(String[] args) {
        int age = 70; // or any value you'd like to test

        if (age >= 65)/*No Semicolon here*/ {
            System.out.println("Age is greater than or equal to 65");
        } else {
            System.out.println("Age is less than 65");
        }
    }
}
