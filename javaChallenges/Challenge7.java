package javaChallenges;

import java.util.HashSet;
import java.util.Set;

public class Challenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,2,3,4};
		
		Set<Integer> numberset = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			numberset.add(nums[i]);
		}
	
		if(numberset.size()==nums.length)
		System.out.println("false - duplicate values not found");
		else
		System.out.println("true - duplicate values found");
	}

}
