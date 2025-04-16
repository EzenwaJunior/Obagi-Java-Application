public class MissingParanthesisAroundLoop {
    public static void main(String[] args) {
        int x = 1, total = 0; 

        while (x <= 100) { /*The {} was not present*/
            total += x;  
            ++x;         
        }

        System.out.println("The total sum of numbers from 1 to 100 is: " + total); 
    }
}
