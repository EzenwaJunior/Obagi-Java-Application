public class EnumsInJava{
	public static void main(String[] args){
		
		AccountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your Saving Account Has Been Created");
			}
			break;
			
			case CHECKING:
			{
				System.out.println("Your Checking Account Has Been Created");
			}
			break;

			case FIXED_DEPOSIT:
			{
				System.out.println("Your Fixed Deposit Account Has Been Created");
			}
			break;			
		}
		
	}
}