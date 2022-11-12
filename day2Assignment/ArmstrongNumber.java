package week1.day2Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 371;
		int calculated = 0;
		int remainder;
		int original;
		
		original = input;
		
		while (original>0)
		{
			int rem;
			rem = original%10;
			int quot;
			quot = original/10;
			original = quot;
			calculated = calculated+(rem*rem*rem);
			
		}
		
		if(input==calculated)
		{
			System.out.println("given number is amstrong number");
		}
		else
		{
			System.out.println("given number is not amstrong number");
		}

	}

}
