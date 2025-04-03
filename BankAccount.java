import java.util.Scanner;

public class BankAccount{
	String accountName = "John Edward";
	String accountNumber = "4590468934";
	double accountBalance = 94746.66;
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA Bank");
		System.out.println("Enter 1 to Withdraw");
		System.out.println("Enter 2 to Deposit");
		
		System.out.print("Enter Your Choice: ");
		int choice =input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter Amount to Withdraw: ");
				int amount = input.nextInt();
				
				bank.withdrawal(amount);
				System.out.printf("Your Account Name is %s%n",bank.accountName);
				System.out.printf("Your Account Number is %s%n",bank.accountNumber);
				System.out.printf("Your Account Balance is %.2f%n",bank.accountBalance);

			}
			break;
			
			case 2:
			{
				System.out.print("Enter Amount to Deposit: ");
				int amount = input.nextInt();
				
				bank.deposit(amount);
				System.out.printf("Your Account Name is %s%n",bank.accountName);
				System.out.printf("Your Account Number is %s%n",bank.accountNumber);
				System.out.printf("Your Account Balance is %.2f%n",bank.accountBalance);
			}
			break;
			default:
				System.out.print("Invalid Input");
				
				
		}
	}
	
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
	}
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
}