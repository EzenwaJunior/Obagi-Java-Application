public class DataType{
	public static void main(String[] args){
		//Interger Type (byte, short, int, long)
		byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 2000000000;
		System.out.printf("The population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The World Population is %d%n",worldPopulation);
		
		//Float-Point Numbers (float, double)
		float weight = 5.6F;
		System.out.printf("The Bag of Rice was %.1f%n",weight);
		
		double accountBalance = 457575.947474;
		System.out.printf("Your Account Balance is %c%.2f%n",'$',accountBalance);
		
		//Boolean type (Boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		//Character type (char)
		char alpha = '@';
		System.out.printf("My Email is ezenwajunior008%cgmail.com",alpha);
	}
}