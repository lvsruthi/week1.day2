package week1.assignment;

public class NegativeToPostiveNumber {

	
	
	public static void main(String[] args) {
		int number =-23;
		
		if(number<0)
		{
			System.out.println("It is a negative number");
			int positive_number =number *-1;
			System.out.println("The positive value of "+number +"is " + positive_number);
			
		}
		else
		{
			System.out.println("The given number is not a negative number");
		}
		
	}
	
}
