package week1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		Arrays.sort(arr);
		int i=0;
        for(i=0;i<arr.length;i++)
        {  
        	if(arr[i]!=(i+1))
        		break;
        	else
        		continue;
        	
        
        }
        System.out.println("The missing element is "+(i+1));
	
	}
}
