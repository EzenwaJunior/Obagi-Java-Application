/* Better Method of Printing Even Numbers from 2 - 20 */

public class PrintEvenNumbers{
	public static void main(String[] args){
		
		for(int i = 1; i <= 20; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}