import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberGenerator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		SecureRandom secureRandom = new SecureRandom();
		
		System.out.print("Enter a Number: ");
		long num = scan.nextLong();
		
		if(num <= 0){
			System.out.println("Number must be Greater than 0");
		}
		else{
			long number = secureRandom.nextLong(num)+1;
			System.out.println("The Lower Limit is 0");
			System.out.println("The Upper Limit is "+ (num + 1));
			
			System.out.printf("The Generated Number is %d%n",number);
		}		
	}
}