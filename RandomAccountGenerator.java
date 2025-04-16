import java.util.Random;
import java.util.Scanner;

public class RandomAccountGenerator{
	private static final String DIGITS = "0123456789";
	
	private static final String ALL_CHARS = DIGITS ;
	private static final Random random = new Random();
	
	private static String generateAccountNumber(int length){
		StringBuilder accountNumber = new StringBuilder(length);
		for (int i = 0; i < length; i++){
			int index = random.nextInt(ALL_CHARS.length());
			accountNumber.append(ALL_CHARS.charAt(index));
		}
		return accountNumber.toString();
	}
	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name = userInput.nextLine();
		
		int length = 10; 
		String accountNumber = generateAccountNumber(length);
		System.out.println("Generated Account Number: " + accountNumber);

		System.out.printf("Hello %s, your Account Number is %s",name,accountNumber);
	}
}
