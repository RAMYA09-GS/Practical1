public class ArmstrongNumber 
{
    	public static void main(String[] args)
	{
        
        	int number = 134;
        	int originalNumber = number;
        	int sum = 0;
	        int digits = 0;
        	for (int temp = number; temp > 0; temp /= 10) 	
		{
            		digits++;
        	}

        
        	for (int temp = number; temp > 0; temp /= 10) 
		{
            		int digit = temp % 10;
           	 	int power = 1;

            
            		for (int i = 0; i < digits; i++) 
			{
                		power *= digit;
            		}

            		sum += power;
        	}

        
        	if (sum == originalNumber) 
		{
            		System.out.println(originalNumber + " is an Armstrong number.");
        	} 
		else 
		{
            		System.out.println(originalNumber + " is not an Armstrong number.");
        	}
    }
}
