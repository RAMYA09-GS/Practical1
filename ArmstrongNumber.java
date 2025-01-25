public class ReverseNumber 
{
    	public static void main(String[] args) 
	{
        
        	int number = 12345; 
        	int reversedNumber = 0;

        
        	for (int temp = number; temp > 0; temp /= 10) 
		{
            		int digit = temp % 10; 
            		reversedNumber = reversedNumber * 10 + digit; 
        	}

        
        	System.out.println("Original number: " + number);
        	System.out.println("Reversed number: " + reversedNumber);
    	}
}

