import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do You Love Java: %b%n",option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The Random Number is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The Random Number is %d%n",integerWithBound);
		
		long pto = random.nextLong();
		System.out.printf("The Random Number is %d%n",pto);
		
		float opt = random.nextFloat();
		System.out.printf("The Random Number is %.2f%n",opt);
		
		double otp = random.nextDouble();
		System.out.printf("The Random Number is %.2f%n",otp);
	}
}