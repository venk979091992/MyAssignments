package week1.day2Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8;
		int firstnum = 0;
		int secondnum = 1;
		int sum;
		
		for(int i=1;i<=range;i++)
		{
			System.out.println(firstnum);
			sum = firstnum + secondnum;
			
			firstnum = secondnum;
			secondnum = sum; 
			
		}
		
	}

}
