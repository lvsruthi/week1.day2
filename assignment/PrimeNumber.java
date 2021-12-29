package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args)
	{
		//Find if its a prime number
		int number = 23;
		int looping_variable =number/2;
		boolean flag= true;
		for(int i=2;i<=looping_variable;i++)
		{
			if((number%i)==0)
			{	flag=false;
			    break;
			}
			else continue;
			 
		}
		if(flag == true)
			System.out.println("Its a Prime Number");
		else
			System.out.println("Its not a Prime Number");
		
	}
	
}
