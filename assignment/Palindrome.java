package week1.assignment;
import java.util.*; 

public class Palindrome {

	
	public static void main( String args[])
	{
		
		int number=675;
		int temp=number;
		int palindrome=0;
		while(temp>0)
		{   
			int rem=temp%10;
			palindrome =(palindrome*10)+rem;
			temp=temp/10;
				
		}
		System.out.println("palindrome"+palindrome);
		if(palindrome==number)
		{
			System.out.print("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
		
		
	}
}
