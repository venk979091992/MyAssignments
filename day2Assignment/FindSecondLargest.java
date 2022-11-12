package week1.day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int numberofdata = data.length;
		System.out.println("largest number is " +data[numberofdata-1]);
		
		int secondlargest =  data[numberofdata-2];
		System.out.println("secondlargest number is " +secondlargest);

	}

}
