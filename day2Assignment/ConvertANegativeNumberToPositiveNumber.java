package week1.day2Assignment;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		
		int number = -45;
		
		if (number<0)
		{
			System.out.println("The given number is negative ***converting to positive number***");
			number = number*-1;
			System.out.println("Number is converted to positive. Result is " +number);
		}
		else
		{
			System.out.println("The given number is positive");
		}
			
	}

}
