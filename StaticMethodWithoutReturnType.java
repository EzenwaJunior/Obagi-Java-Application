public class StaticMethodWithoutReturnType{
	public static void main(String[] args){
		StaticMethodWithoutReturnType.addition(); //to invoke a static void
	}
	public static void addition(){
		int num1 = 15;
		int num2 = 20;
		
		int sum = num1 + num2;
		System.out.printf("The Sum is %d%n",sum);
	}
}