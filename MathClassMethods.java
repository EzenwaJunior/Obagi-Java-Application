import java.util.Scanner;

public class MathClassMethods{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int num = input.nextInt();
		
		System.out.printf("The Absolute value is %d%n",Math.abs(num));
		
		System.out.print("Enter a float point number: ");
		double num1 = input.nextDouble();
		
		System.out.printf("The rounded value is %d%n",Math.round(num1));
		
		System.out.printf("The rounded value is %fdc%n",Math.pow(num1,2));
		
		System.out.printf("The rounded value is %f%n",Math.sqrt(num1));
		
		System.out.printf("----------------------------------------------------------%n");
		
		System.out.printf("Enter the First Number: ");
		int number1 = input.nextInt();
		
		System.out.printf("Enter Second Number: ");
		int number2 = input.nextInt();
		
		System.out.printf("The Minimum Number is %d%n",Math.min(number1,number2));
		
		
		System.out.printf("----------------------------------------------------------%n");
		
		System.out.printf("Enter the First Number: ");
		int number3 = input.nextInt();
		
		System.out.printf("Enter Second Number: ");
		int number4 = input.nextInt();
		
		System.out.printf("The Maximum Number is %d%n",Math.max(number3,number4));
		
		System.out.printf("The Random Number is %f%n",Math.random());
		
		System.out.printf("----------------------------------------------------------%n");
		
		System.out.printf("To Calculate Area of a Circle ");
		
		
		System.out.printf("Enter the Radius of the Circle: ");
		int radius = input.nextInt();
		
		double areaOfCircle = Math.PI * Math.pow(radius,2);
		
		System.out.printf("The Area Of a Circle is %f%n",areaOfCircle);
		
	}
}