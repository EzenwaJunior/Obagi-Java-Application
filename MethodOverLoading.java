import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calaculate Perimeter of Different Shapes");
		System.out.println("Enter 1 To Calculate Perimeter of A Square");
		System.out.println("Enter 2 To Calculate Perimeter of A Rectangle");
		System.out.println("Enter 3 To Calculate Perimeter of A Circle");
		System.out.println();
		
		System.out.print("Enter Your Choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the Length of Square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the Length of Rectangle: ");
				int lengthOfRectangle = input.nextInt();

				System.out.print("Enter the Breadth of Rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lengthOfRectangle,breadthOfRectangle);
			}
			break;

			case 3:
			{
				System.out.print("Enter the Radius of Circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void shape(int length) {
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The Perimeter of The Square is %d%n", perimeterOfSquare);
	}
	
	public static void shape(int length, int breadth){
		int perimeterOfRectangle = 2*(length + breadth);
		
		System.out.printf("The Perimeter of The Rectangle is %d%n",perimeterOfRectangle);
		
	}
	
	public static void shape(double radius)
	{
		double perimeterOfCircle = 2 * Math.PI + radius;
		
		System.out.printf("The Perimeter of The Circle is %f%n",perimeterOfCircle);
	}
}
