public class PrintMethods{
	public static void main(String[] args){
		// Using the print()(print method)
		System.out.print("\"Learning Java is Fun\"\n");
		System.out.print(" Hey, come Learn Java with me");
		
		//Using the Println()
		System.out.println();
		System.out.println("I want to tell you that Java is different from Javascript");
		System.out.println("\t This is the indented text");
		
		//Using the printf()
		System.out.printf("My name is %s and i love %s%n","John","Java");
		System.out.printf("I am living in No. %d Kaduna Street%n",1);
		System.out.printf("I bought Java JDK with %c%f Naira %n",'$',159.345);
		System.out.printf("I bought Java JDK with %.2f Naira%n", 159.345);
	}
}