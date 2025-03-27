import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter *131# To Suscribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *606# To Borrow Data");
		System.out.println("");
		
		System.out.print("Enter Code: ");
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
				System.out.println("Enter 1 for 1 Month Subscription");
				System.out.println("Enter 2 for 2 Months Subscription");
				System.out.println("Enter 3 for 3 Months Subscription");
				System.out.println("Enter 4 for 4 Months Subscription");
				System.out.println("");
				
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println(" Your One Month Subscription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println(" Your Two Months Subscription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println(" Your Three Months Subscription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println(" Your Four Months Subscription has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your Balance is: N6594.86");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 To Borrow 1000");
				System.out.println("Enter 2 To Borrow 2000");
				System.out.println("Enter 3 To Borrow 3000");
				System.out.println("Enter 4 To Borrow 4000");
				System.out.println("");
				
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println(" You have Borrowed 1000");
					}
					break;
					
					case 2:
					{
						System.out.println(" You have Borrowed 2000");
					}
					break;
					
					case 3:
					{
						System.out.println(" You have Borrowed 3000");
					}
					break;
					
					case 4:
					{
						System.out.println(" You have Borrowed 4000");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			}
			break;
			default:
					System.out.println("Invalid Input");
		}
	}
}