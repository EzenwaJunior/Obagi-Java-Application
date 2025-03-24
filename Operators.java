public class Operators{
	public static void main(String[] args){
		// Assignment Operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		// Arithmetic Operator(+,-,*,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int differnce = num1 - num2;
		
		double quotient = (double) num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational Operators(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2; 
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanOrEqualTo = num1 >= num2;
		boolean isLessThanOrEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operators(AND(&&), OR(||), NOT(!))
		boolean isAndOperator = num1 > num2 && num1 >= num2;
		boolean isOrOperator = num1 == num2 || num1 > num2; 
		boolean isNotOperator = !(num1 == num2 || num1 > num2);
		
		
		System.out.printf("The sum of the numbers %d%n",sum);
		System.out.printf("The product of the numbers %d%n",product);
		System.out.printf("The differnce between %d and %d is %d%n",num1,num2,differnce);
		System.out.printf("The quotient is %f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		System.out.printf("=================================================%n");	
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);		
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		System.out.printf("=================================================%n");
		System.out.printf("Is %d > %d && %d >= %d %b?%n",num1,num2,num1,num2,isAndOperator);
		System.out.printf("Is %d > %d && %d >= %d %b?%n",num1,num2,num1,num2,isOrOperator);
		System.out.printf("Is !(%d == %d !! %d > %d)? %b%n",num1,num2,num1,num2,isNotOperator);
	}
}